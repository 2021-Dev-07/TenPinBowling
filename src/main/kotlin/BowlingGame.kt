class BowlingGame {

    private var rolls  = IntArray(21)
    private var rollCount = 0

    fun addRoll(roll : Int) {
        rolls[rollCount] = roll
        rollCount++
    }

    fun getTotalScore(): Int {
        var grandTotal  = 0
        var scorePosition = 0
        for (i in 1..20 step 2){
            val frame = Frame(rolls, scorePosition)
            grandTotal += frame.getScore()
            scorePosition = frame.getNextPosition()
        }
        return grandTotal
    }


    /**
     * Utility method to parse users string into score card.
     * below are some of the score string can be use to enter while
     * run the app
     *
     * ex : X X X X X X X X X X X X
     * ex : 9- 9- 9- 9- 9- 9- 9- 9- 9- 9-
     * ex : 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5
     */

    fun parseDigitFrom(str: String): ArrayList<Int> {
        val list = ArrayList<Int>()
        val stringNoWhitespace = str.replace("\\s".toRegex(), "")
        var currentIndex = 0
        for (element in stringNoWhitespace) {
            if(element.equals('X', true)){
                list.add(10)
            } else if(element == '/'){
                list.add(10-(list[currentIndex-1]))
            }else if(element == '-'){
                list.add(0)
            }else{
                list.add(element.digitToInt())
            }
            currentIndex++
        }
        return list
    }

}


fun main() {

    println("enter valid sequence of Score")
    val scoreInput = readLine()!!
    val bowlingGame = BowlingGame()
    val list = bowlingGame.parseDigitFrom(scoreInput)
    list.forEach { bowlingGame.addRoll(it) }
    println("Total Score is : "+bowlingGame.getTotalScore())

}