package simplepdl.manip.transform;

import petrinet.Arc;
import petrinet.ArcDirection;
import petrinet.ArcKind;
import petrinet.PetriNetwork;
import petrinet.PetrinetFactory;
import petrinet.Place;
import petrinet.Transition;
import simplepdl.ACResource;
import simplepdl.Resource;
import simplepdl.WorkDefinition;

public class WorkDefinitionToPetriNet {
	public WorkDefinitionToPetriNet(WorkDefinition wd, PetriNetwork pn, PetrinetFactory factory) {
		this.wd = wd;
		this.pn = pn;
		this.factory = factory;
	}

	// Getters
	public Place getStarted() {
		return started;
	}
	public Place getFinished() {
		return finished;
	}

	public Transition getStarts() {
		return starts;
	}
	public Transition getFinishes() {
		return finishes;
	}

	// Builders
	public void buildPetriNet() {
		buildPlaces();
		buildTransitions();
		buildArcs();
		buildResources();
	}

	private void buildPlaces() {
		notStarted = factory.createPlace();
		pn.getPlaces().add(notStarted);
		notStarted.setName(wd.getName() + "_notStarted");
		notStarted.setMarking(1);

		started = factory.createPlace();
		pn.getPlaces().add(started);
		started.setName(wd.getName() + "_started");
		started.setMarking(0);
		
		running = factory.createPlace();
		pn.getPlaces().add(running);
		running.setName(wd.getName() + "_running");
		running.setMarking(0);

		finished = factory.createPlace();
		pn.getPlaces().add(finished);
		finished.setName(wd.getName() + "_finished");
		finished.setMarking(0);
	}
	private void buildTransitions() {
		starts = factory.createTransition();
		starts.setName(wd.getName() + "_starts");
		pn.getTransitions().add(starts);

		finishes = factory.createTransition();
		finishes.setName(wd.getName() + "_finishes");
		pn.getTransitions().add(finishes);
	}
	private void buildArcs() {
	    Arc[] arcs = new Arc[5];
	    
	    // Define arcs data : order is important
	    Object[][] arcData = {
	        {notStarted, starts, ArcDirection.P2T},   	 	// notStarted -> starts
	        {running, starts, ArcDirection.T2P},      	 	// starts -> running
	        {started, starts, ArcDirection.T2P},      	 	// starts -> started
	        {started, finishes, ArcDirection.P2T},    	 	// started -> finishes
	        {finished, finishes, ArcDirection.T2P},    	 	// finishes -> finished
	    };

	    // Apply these properties to arcs
	    for (int i = 0; i < arcs.length; i++) {
	        arcs[i] = factory.createArc();
	        arcs[i].setKind(ArcKind.NORMAL);
	        arcs[i].setPlace((Place) arcData[i][0]);
	        arcs[i].setTransition((Transition) arcData[i][1]);
	        arcs[i].setDirection((ArcDirection) arcData[i][2]);
	        pn.getArcs().add(arcs[i]);
	    }
	}
	private void buildResources() {
		for (ACResource acResource : wd.getResources()) {
			Resource resource = acResource.getResource();
			
			Place resourcePlace = factory.createPlace();
			resourcePlace.setName(resource.getName());
			resourcePlace.setMarking(resource.getQuantity());
			pn.getPlaces().add(resourcePlace);
			
			Arc getResourceArc = factory.createArc();
			getResourceArc.setPlace(resourcePlace);
			getResourceArc.setTransition(starts);
			getResourceArc.setDirection(ArcDirection.P2T);
			getResourceArc.setKind(ArcKind.NORMAL);
			getResourceArc.setWeight(resource.getQuantity());
			pn.getArcs().add(getResourceArc);

			Arc returnResourceArc = factory.createArc();
			returnResourceArc.setPlace(resourcePlace);
			returnResourceArc.setTransition(finishes);
			returnResourceArc.setDirection(ArcDirection.T2P);
			returnResourceArc.setKind(ArcKind.NORMAL);
			returnResourceArc.setWeight(resource.getQuantity());
			pn.getArcs().add(returnResourceArc);
		}
	}

	// Attributes
	private PetrinetFactory factory;
	private WorkDefinition wd;
	private PetriNetwork pn;

	private Place started, finished, running, notStarted; 			  // Basic WorkDefinition places
	
	private Transition starts, finishes;							  // WorkDefinition transitions
}
