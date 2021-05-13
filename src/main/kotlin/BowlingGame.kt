class BowlingGame {

    var scores  = IntArray(21)
    var scoreposition = 0;

    fun addScore(score : Int) {
        scores[scoreposition] = score
        scoreposition++
    }

    fun getTotalScore(): Int {
        var grandTotal  = 0
        var scoreposition = 0
        for (i in 1..20 step 2){
            var frame = Frame(scores, scoreposition)
            grandTotal += frame.getscore()
            scoreposition = frame.getNextPosition()
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
        var list = ArrayList<Int>()
        var strwithnoWhitespace = str.replace("\\s".toRegex(), "")
        var currentIndex = 0;
        for (element in strwithnoWhitespace) {
            if(element.equals('X', true)){
                list.add(10)
            } else if(element.equals('/')){
                list.add(10-(list.get(currentIndex-1)))
            }else if(element.equals('-')){
                list.add(0)
            }else{
                list.add(element.digitToInt())
            }
            currentIndex++
        }
        return list;
    }

}


fun main(args : Array<String>) {

    println("enter valid sequence of Score")
    val scoreInput = readLine()!!
    var bowlingGame = BowlingGame()
    var list = bowlingGame.parseDigitFrom(scoreInput)
    list.forEach { bowlingGame.addScore(it) }
    println("Total Score is : "+bowlingGame.getTotalScore())

}