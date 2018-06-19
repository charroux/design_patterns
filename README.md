# design_patterns

T�l�charger le projet et d�compressez-le

------------------------------------------

Compiler le projet :

- sous Windows : gradlew build
- sous Eclipse : ./gradlew build

---------------------------------------------

Convertir le projet en un projet Eclipse :

- sous Windows : gradlew eclipse
- sous Linux : ./gradlew eclipse

---------------------------------------------

Importer le projet sous Eclipse :

File -> Import -> General -> Existing project into workspace

--------------------------------------------

Lancer le main en tant que Java application : https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/DesignPatternsApplication.java

----------Couche domain (implantation du diagramme de classes) -------------------------

Une classe Voiture qui va g�n�rer une table : 
https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/domain/Voiture.java

Une classe Passager qui va g�n�rer une table : 
https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/domain/Passager.java

Une interface pour r�aliser la design pattern CRUD pour les voitures :
https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/domain/VoitureRepository.java

Une interface pour r�aliser la design pattern CRUD pour les passagers :
https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/domain/PassagerRepository.java

----------Couche applicative (implantation du diagramme de use cases) -------------------------

Une interface qui r�alise un use case : https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/application/Conduire.java

Une classe qui implante l'interface et qui utilise la couche domain : https://github.com/charroux/design_patterns/blob/master/src/main/java/epsi/design_patterns/projet/application/ConduireTaxi.java

