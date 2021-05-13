class BowlingGame {
    var scores = 0;
    fun addScore(score : Int) {
        scores += score;
    }

    fun getTotalScore(): Int {
        return scores
    }

}