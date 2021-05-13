class Frame(scores: IntArray, scorePosition: Int) {

    private var score: Int = 0;
    private var nextScorePosition  = 0
    private val  PERFECT_SCORE = 10

    init {
        calculateScoreAndNextScorePosition(scores, scorePosition)
    }

    private fun calculateScoreAndNextScorePosition(scores: IntArray, scorePosition: Int) {
        val scoreFirst = scores[scorePosition]
        val scoreSecond = scores[scorePosition + 1]

        if (isSpareScore(scoreFirst, scoreSecond)) {
            val bonusScore = scores[scorePosition + 2]
            score = PERFECT_SCORE + bonusScore
            nextScorePosition = scorePosition + 2
            return
        }
        if (isStrikeScore(scoreFirst)) {
            val bonusScore = scoreSecond + scores[scorePosition + 2]
            score = PERFECT_SCORE + bonusScore
            nextScorePosition = scorePosition + 1
            return
        }

        score = (scoreFirst + scoreSecond)
        nextScorePosition = scorePosition + 2
    }

    fun getscore(): Int {
        return score
    }

    fun getNextPosition() : Int {
        return nextScorePosition
    }

    fun isSpareScore(scoreFirst: Int, scoreSecond: Int) = (scoreFirst + scoreSecond) == PERFECT_SCORE


    fun isStrikeScore(scoreFirst: Int) = scoreFirst == PERFECT_SCORE


}