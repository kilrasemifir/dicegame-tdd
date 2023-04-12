# Exemple DiceGame en TDD

## Préréquis

* [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
* [IDE Java](https://www.jetbrains.com/fr-fr/idea/download/#section=windows)

## Enoncé

### User story : Dice Game

> Il y a un gobelet pour la partie
> Il y a un dé par joueur dans le gobelet
> Chaque joueur lance à tour de rôle le gobelet
> Le joueur avec le plus grand score gagne la manche
> Le joueur avec le plus de manche gagnées gagne la partie
> Il  y a autant de manches que de joueur + 1

**Remarque de maitre licorne:**
- un gobelet par partie
- un dé par joueur dans le gobelet
- Autant de manches que de joueurs + 1




### Scénario 1 :  Avant la partie

- En tant que joueur, je veux saisir le gobelet

- En tant que joueur, je veux connaitre le nombre de participants.

- En tant que joueur, je veux connaitre le nombre de manches.

- En tant que joueur, je veux connaitre le nombre de dés que je lance.

- En tant que joueur, je veux compter le nombre de participants.

- En tant que joueur, je veux ramasser les dés des participants.

### Scénario 2 :  Pendant la partie

- En tant que joueur, je prend le gobelet qui contiens l'ensemble des dés et je lance ceux-ci, je veux connaitre mon score.

- En tant que joueur, je veux connaitre combien de joueurs ont lancé leurs dés.

- En tant que joueur, je veux connaitre combien de joueurs restent à lancer leurs dés.

- En tant que joueur, je veux ramasser les dés qui sont tombés sur le sol.

- En tant que joueur je veux mettre les dés dans le gobelet.

- En tant que joueur, je veux passer le gobelet au joueur suivant.

- En tant que joueur, je veux lors de mon tour connaitre le score de mes adversaires.

- En tant que joueur, je veux connaitre le gagnant de la manche.

- En tant que joueur, je veux connaitre le nombre de manches gagnées par les autres participants.


### Scénario 3 :  Après la partie

- En tant que joueur, je veux connaitre le gagnant de la partie.

- En tant que joueur, je veux pouvoir connaitre mon nombre de manches gagnées.

- En tant que joueur, je veux pouvoir connaitre le plus petits nombre de manches gagnées par les autres participants.

- En tant que joueur, je veux ranger le gobelet et les dés.




