// Quizz

class Question(val question : String, val reponses : String)
fun main(){

    //Proposition des sujets
    val sujet = listOf("Mathematiques", "Histoire", "Francais")

//Questionnaires
    val questions = mapOf("Mathematiques" to listOf(
        Question("Quel est le carré de 2 ?", "4"),
        Question("Quel est le pgcd(11,12)?", "1"),
        Question("Quel est le double de 112?", "224"),
        Question("Quelle est la partie entière de -2,7", "-3"),
        Question("Quel est le log(1)", "0"),
        Question("Quel est le quart de 24?", "6"),
        Question("Quel est le ppcm(11,12)?", "132"),
        Question("Quel est la solution de l'equation X+16= 8", "-8"),
        Question("Combien font 23/100", "0,23"),
        Question("Que vaut exp(0)?", "1")
    ),
    "Histoire" to listOf(
        Question("Qui a decouvert l'Amerique ?", "Christophe Colomb"),
        Question("Quel est le plus long fleuve du monde ?", "Amazone"),
        Question("En quelle année a commencé la 1ere guerre mondiale ?", "1914"),
        Question("Qui a peint la Joconde ?", "Leornard De Vinci"),
        Question("Quel est le plus haut mont du monde ?", "Everest"),
        Question("Quelle est la capitale de l'Australie ?", "Sydney"),
        Question("Quel est le président actuel de la Russie ?", "Vladimir Poutine"),
        Question("Quel est la capitale du Mali?", "Bamako"),
        Question("Quel pays a remporte la derniere CAN", "Cote d'ivoire"),
        Question("Quel est l'Ocean le plus vaste du monde", "Pacifique"),
    ),
        "Francais" to listOf(
            Question("Quel est le pluriel de labsus ?", "labsi"),
            Question("Quel est le pétit d'un elephant ?", "elephanteau"),
            Question("Quel est la femelle du bouc ?", "chèvre"),
            Question("Quel est le participe passé du verbe coudre ?", "cousu"),
            Question("Quel est le participe present du verbe coudre ?", "en cousant"),
            Question("Comment appelle t-on le cri du chat?", "Miolement"),
            Question("<<ces>>, est un adjecctif possessif ou démonstratif?", "démonstratif"),
            Question("Quel est la nature du mot <<caqueter>> ?", "verbe du 1er groupe"),
            Question("Comment appelle t-on celui qui soigne les enfants ?", "pédiatre"),
            Question("Dans la phrase <<J'avais bien voulu etre avec vous...>> a quel temps est conjuqué le verbe?" , "plus que parfait"),

        )
    )

    // Choix du sujet par l'utilisateur
    println("Choissisez un sujet : ${sujet.joinToString (",")}")
    val sujetchoisi = readLine()

    if(sujetchoisi !in sujet ){
        println("sujet invalide")
        return
    }
// nombre de points
    val quizquestions = questions[sujetchoisi] ?: emptyList()
    var points = 0
    for (question in quizquestions.take(10)) {
        println(question.question)
        val reponse = readLine()
        if (reponse.equals(question.reponses,ignoreCase = true)) {
            points++
        }
// Temps
        Thread.sleep(10000)
    }

    println("Votre score est de : $points points")

    //Resultat final
    when{
        points < 5 -> println("Vous avez échoué.")
        points > 5 -> println("Vous avez réussi.")
        else -> {
            println("Vous avez obtenu un score de 5. Voulez-vous repasser le quizz ?, repondre par oui ou non")
            val reponses1 = readLine()
            if (reponses1.equals("oui", ignoreCase = true)) {
                main() // recommencer le quiz
            } else {
                println("Vous avez echoué.")
            }
        }
    }
}