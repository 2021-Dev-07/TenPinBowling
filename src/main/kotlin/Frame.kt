class Frame {

    var rollScore: Int = 0;

    private var score: Int = 0;

    fun addScore(score: Int) {
        this.score += score
    }

    fun addScore(score1: Int, score2: Int, score3: Int) {
        if (isStrikeScore(score1))
            this.score = 10 +score2+score3
        if (isSpareScore(score1, score2))
            this.score = 10 + score3
    }

    fun getscore(): Int {
        return score
    }

    fun isSpareScore(scoreFirst: Int, scoreSecond: Int): Boolean {
        if ((scoreFirst + scoreSecond) == 10)
            return true
        return false
    }

    fun isStrikeScore(scoreFirst: Int): Boolean {
        if (scoreFirst == 10)
            return true
        return false
    }


}