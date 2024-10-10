# Mini-Projet : Ingénierie dirigée par les modèles
## Sujet : Chaîne de vérification de modèles de processus

### I) Création des métamodèles

Dans un premier temps je me suis concentré sur la création des métamodèles.

On dispose de deux métamodèles :
- Le métamodèle SimplePDL qui permet de décrire des processus de développement logiciel.
- Le métamodèle PetriNet qui permet de décrire des réseaux de Petri.

J'ai choisi de définir ces métamodèles dans des projets Ecore Modeling et de configurer la génération de code Java pour ces métamodèles (`.genmodel`) afin que le code généré soit disponible dans les sources d'un même projet.

#### 1) Métamodèle SimplePDL

Pour définir le métamodèle SimplePDL, j'ai utilisé l'outil EMF (Eclipse Modeling Framework) qui permet de définir des métamodèles sous forme de diagrammes de classes UML. Les quelques choix de conception que j'ai fait sont les suivants :
- J'ai choisi de définir les relations bi-directionnelles via les objets `eOpposite` pour simplifier la navigation dans le modèle.
- J'ai choisi d'interfacer la connection entre les `WorkDefinition` et les `Resource` à travers une AssociationClass `ACResource` pour ajouter des informations supplémentaires à la relation.

#### 2) Métamodèle PetriNet

Pour définir le métamodèle PetriNet, j'ai utilisé l'outil EMF (Eclipse Modeling Framework) qui permet de définir des métamodèles sous forme de diagrammes de classes UML. Les quelques choix de conception que j'ai fait sont les suivants :
- J'ai choisi de définir les relations bi-directionnelles via les objets `eOpposite` pour simplifier la navigation dans le modèle.

### II) Transformation SimplePDL vers PetriNet

Dans un second temps, j'ai implémenté une transformation de modèle SimplePDL vers PetriNet.
