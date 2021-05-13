class Frame {

    private var score: Int = 0;
    private var nextScorePosition  = 0

    constructor(scores : IntArray , scorePosition : Int){
        if(isSpareScore(scores[scorePosition], scores[scorePosition+1])){
            score = 10 + scores[scorePosition+2]
            nextScorePosition = scorePosition+2
        }
        else if (isStrikeScore(scores[scorePosition])){
            score = 10 + scores[scorePosition+1] + scores[scorePosition+2]
            nextScorePosition = scorePosition+1
        }
        else {
            score = (scores[scorePosition] + scores[scorePosition+1])
            nextScorePosition = scorePosition+2
        }

    }

    fun getscore(): Int {
        return score
    }

    fun getNextPosition() : Int {
        return nextScorePosition
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