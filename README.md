# Zen Books

L'application Zen Books permet de gérer les livres d'une bibliothèque.

L'application utilise une base embarquée (HSQL) qui est peuplée au lancement de l'application.

L'application est ensuite disponible sur le port 8080 : <http://localhost:8080>

Le front a été testé et fonctionne correctement. 
Coté back, certaines fonctionnalités n'ont pas été implémentées ou semblent buguées. 
Le candidat devra rendre l'application opérationelle.

## Bugs remontés:

1. la table des livres est bien remplie, mais aucun livre ne s'affiche 
2. la table des auteurs est bien remplie, mais ils ne s'affichent pas
3. en cliquant sur le bouton "supprimer" le livre ne s'affiche plus, mais en rafraichissant la page le livre réapparaît
4. l'ajout de note ne fonctionne pas
