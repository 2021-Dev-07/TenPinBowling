class BowlingGame {

    var scores  = IntArray(21)
    var scoreposition = 0;

    fun addScore(score : Int) {
        scores[scoreposition] = score
        scoreposition++
    }

    /*fun getTotalScore(): Int {
        for (i in 1..20){

        }
        var frame = Frame()
        frame.addsc
        return scores
    }*/

}