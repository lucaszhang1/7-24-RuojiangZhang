import java.awt.Choice
import kotlin.random.Random

fun main(){

    var wantToPlayAgain = true

    while (wantToPlayAgain) {
        displayWelcomeMessage()
        val userChoice: Int = readLine()?.toInt() ?: 0
        val aiChoice = Random.nextInt(1, 3)
        playGame(userChoice, aiChoice)
        wantToPlayAgain = wantToPlayAgain()
    }
    println("Thank you for playing")
}

fun playGame(userChoice: Int, aiChoice: Int){
    println("You chose ${userChoice} and the AI chose ${aiChoice}.")
    val result = when (userChoice){
        aiChoice -> "You tied!"
        1 -> if (aiChoice == 2) "You loose!" else "You Won!"
        2 -> if (aiChoice == 3) "You loose!" else "You Won!"
        3 -> if (aiChoice == 1) "You loose!" else "You Won!"
        else -> "ERROR - INVALID ENTRY"
    }
}


private fun displayWelcomeMessage() {
    println("Welcome come to RPS")
    println("Please enter one of the following numbers")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")
    println("Enter your selection")
}

private fun wantToPlayAgain(): Boolean{
    println("Would you like to play again? y/n")
    val userChoice: String = readLine().toString()
    val result = when (userChoice){
        "y" -> true
        else -> false
    }
    return result
}