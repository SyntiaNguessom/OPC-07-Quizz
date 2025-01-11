OPC - O8: Elaboration d'un quizz

Un utilisateur choisit son sujet parmi un nombre de sujets donnés, tu lui propose 10 questions, chaque question à 10s pour être répondue ainsi de suite.

A la fin du questionnaire, tu lui donnes son score final : 

-> Si c’est inférieur à 5 il a échoué 

-> Si c’est supérieur à 5 il a réussi 

-> Si c’est égal à 5 si choisit s’il veut repasser le quizz ou pas, s'il refuse de repasser il a échoué sinon il rechoisit son sujet


°°°° Brève explication du code :

On créé une classe de données pour représenter une question et sa réponse.
Les sujets sont définis dans une liste et les questions sont stockées dans une carte (Map) où chaque sujet correspond à une liste de questions.

Choix du Sujet : L'utilisateur choisit un sujet parmi ceux proposés.

Pour chaque question, l'utilisateur a 10 secondes pour répondre.
Si la réponse est correcte, le point est incrémenté.

Calcul du Score : À la fin des 10 questions, le score est affiché, et selon le score, un message approprié est donné. Si l'utilisateur obtient un score de 5, il a la possibilité
de repasser le quiz.

Temps :  La fonction Thread.sleep(10000) simule le temps de réponse de 10 secondes.


