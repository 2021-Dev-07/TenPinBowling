import Frame.FrameConstants.PERFECT_SCORE

class Frame(scores: IntArray, scorePosition: Int) {

    private var score: Int = 0
    private var nextScorePosition  = 0
    object FrameConstants {
        const val PERFECT_SCORE = 10
    }

    init {
        calculateScoreAndNextScorePosition(scores, scorePosition)
    }

    private fun calculateScoreAndNextScorePosition(scores: IntArray, scorePosition: Int) {
        val scoreFirst = scores[scorePosition]
        val scoreSecond = scores[scorePosition + 1]

        if (isSpareScore(scoreFirst, scoreSecond)) {
            calculateSpareFrameScore(scores, scorePosition)
            nextScorePosition = scorePosition + 2
            return
        }
        if (isStrikeScore(scoreFirst)) {
            calculateStrikeFrameScore(scoreSecond, scores, scorePosition)
            nextScorePosition = scorePosition + 1
            return
        }

        calculateOpenFrameScore(scoreFirst, scoreSecond)
        nextScorePosition = scorePosition + 2
    }

    private fun calculateOpenFrameScore(scoreFirst: Int, scoreSecond: Int) {
        score = (scoreFirst + scoreSecond)
    }

    private fun calculateStrikeFrameScore(scoreSecond: Int, scores: IntArray, scorePosition: Int) {
        val bonusScore = scoreSecond + scores[scorePosition + 2]
        score = PERFECT_SCORE + bonusScore
    }

    private fun calculateSpareFrameScore(scores: IntArray, scorePosition: Int) {
        val bonusScore = scores[scorePosition + 2]
        score = PERFECT_SCORE + bonusScore
    }

    fun getScore(): Int {
        return score
    }

    fun getNextPosition() : Int {
        return nextScorePosition
    }

    private fun isSpareScore(scoreFirst: Int, scoreSecond: Int) = (scoreFirst + scoreSecond) == PERFECT_SCORE


    private fun isStrikeScore(scoreFirst: Int) = scoreFirst == PERFECT_SCORE


}