class BowlingGame {

    var scores  = IntArray(21)
    var scoreposition = 0;

    fun addScore(score : Int) {
        scores[scoreposition] = score
        scoreposition++
    }

    fun getTotalScore(): Int {
        var grandTotal  = 0
        scoreposition = 0
        for (i in 1..20 step 2){
            var frame = Frame(scores, scoreposition)
            grandTotal += frame.getscore()
            scoreposition++
        }
        return grandTotal
    }

}