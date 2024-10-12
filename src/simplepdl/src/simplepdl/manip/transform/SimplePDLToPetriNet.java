package simplepdl.manip.transform;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Arc;
import petrinet.ArcDirection;
import petrinet.ArcKind;
import petrinet.PetriNetwork;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;


import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.SimplepdlPackage;

public class SimplePDLToPetriNet {
	public static void main(String[] args) {
		// Chargement des packages
		SimplepdlPackage _ = SimplepdlPackage.eINSTANCE;
		PetrinetPackage _ = PetrinetPackage.eINSTANCE;
		
		// Définition d'une ressource pour le format xmi
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet ResourceSet pour contenir les modèles chargés
		ResourceSet resSet = new ResourceSetImpl();

		// Charger le modèle SimplePDL
		URI simplepdlURI = URI.createURI("target/SimplePDLExample1.xmi");
		Resource simplepdlResource = resSet.getResource(simplepdlURI, true);
		
		// Créer le modèle PetriNet
		URI petriURI = URI.createURI("target/PetriNetFromSimplePDLExample1.xmi");
		Resource petriResource = resSet.createResource(petriURI);
		
		// La fabrique pour fabriquer les éléments de SimplePDL
		PetrinetFactory factory = PetrinetFactory.eINSTANCE;
		
		// On instancie le process et le petrinet
		Process process = (Process) simplepdlResource.getContents().get(0);
		PetriNetwork petrinet = factory.createPetriNetwork();
		petrinet.setName(process.getName());

		// On mappe les WorkDefinition avec les équivalences PetriNet
		Map<WorkDefinition, WorkDefinitionToPetriNet> map = new HashMap<>();
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				WorkDefinitionToPetriNet wdToPn = new WorkDefinitionToPetriNet(wd, petrinet, factory);
				wdToPn.buildPetriNet();
				map.put(wd, wdToPn);
			}
		}
		
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				WorkSequenceType linkType = ws.getLinkType();
				
				WorkDefinitionToPetriNet predecessor = map.get(ws.getPredecessor());
				WorkDefinitionToPetriNet successor = map.get(ws.getSuccessor());
				
				Arc link = factory.createArc();
				link.setDirection(ArcDirection.P2T);
				link.setKind(ArcKind.READ);
				link.setWeight(1);
				
				switch (linkType.getValue()) {
					case WorkSequenceType.START_TO_START_VALUE:
						link.setPlace(predecessor.getStarted());
						link.setTransition(successor.getStarts());
						break;
					case WorkSequenceType.START_TO_FINISH_VALUE:
						link.setPlace(predecessor.getStarted());
						link.setTransition(successor.getFinishes());
						break;
					case WorkSequenceType.FINISH_TO_START_VALUE:
						link.setPlace(predecessor.getFinished());
						link.setTransition(successor.getStarts());
						break;
					case WorkSequenceType.FINISH_TO_FINISH_VALUE:
						link.setPlace(predecessor.getFinished());
						link.setTransition(successor.getFinishes());
						break;
				}
				
				petrinet.getArcs().add(link);
			}
		}

		try {
			petriResource.getContents().add(petrinet);
			petriResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
