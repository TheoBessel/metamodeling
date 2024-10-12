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
- J'ai choisi de définir des valeurs différentes pour les littéraux de l'énumération `WorkSequenceType` afin de pouvoir les distinguer plus facilement dans du code Java.

#### 2) Métamodèle PetriNet

Pour définir le métamodèle PetriNet, j'ai utilisé l'outil EMF (Eclipse Modeling Framework) qui permet de définir des métamodèles sous forme de diagrammes de classes UML. Les quelques choix de conception que j'ai fait sont les suivants :
- J'ai choisi de définir les relations bi-directionnelles via les objets `eOpposite` pour simplifier la navigation dans le modèle.

### II) Transformation SimplePDL vers PetriNet

Dans un second temps, j'ai implémenté une transformation de modèle SimplePDL vers PetriNet.

Pour cela j'ai décidé de définir une première classe `WorkDefinitionToPetriNet` qui permet de transformer une `WorkDefinition` en un `PetriNet` équivalent. Cela me permet de transformer un processus de développement logiciel en un réseau de Petri selon un schéma bien défini puis de connecter ces réseaux de Petri entre eux afin de définir des `WorkSequence`.

J'ai fait le même choix pour représenter les `Resource` dans les `PetriNet` pour les mêmes raisons que pour les `WorkDefinition`.

Dans ces deux classes `WorkDefinitionToPetriNet` et `ResourceToPetriNet`, j'ai exposé publiquement les attributs, à l'aide de getters et setters, qui permettent de connecter ces éléments entre eux pour réaliser la transformation.

Cette transformation est réalisée en deux étapes :
1) Transformation des `WorkDefinition` en `PetriNet` : Pour chaque `WorkDefinition` on crée un `PetriNet` équivalent.
2) Connexion des `PetriNet` entre eux : Pour chaque `WorkSequence` on connecte les `PetriNet` entre eux en choisissant l'`Arc` approprié au `WorkSequenceType`.
3) On ajoute les `Resource` aux `PetriNet` en fonction des `ACResource` associés aux `WorkDefinition`.