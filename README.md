# My Event

## Pré-requis : 
    
* Maven
* Un ide au choix
* Un navigateur
* Un client git

## Démarrage 

* L'application My Event permet de gérer les evenements musicaux.

* L'application utilise une base embarquée (HSQL) qui est peuplée au lancement de l'application.

* L'application démarre via ```mvn spring-boot:run```

* L'application est ensuite disponible sur le port 8080 : <http://localhost:8080>

## Contexte

* Le front a été testé et fonctionne correctement. 
* Dans le back (partie java), tout n'est pas entièrement fonctionnel. 
* L'objectif est de fixé les bugs ci dessous.

## Bugs remontés:

1. la table des evenements est bien remplie, mais aucun evenement ne s'affiche
2. la table des groupes est bien remplie, mais ils ne s'affichent pas
3. l'ajout de note ne fonctionne pas
4. en cliquant sur le bouton "supprimer" l'evenement ne s'affiche plus, mais en rafraichissant la page l'evenement réapparaît 
