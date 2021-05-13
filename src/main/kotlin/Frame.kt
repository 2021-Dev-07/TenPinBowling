class Frame {

    var rollScore: Int = 0;

    private var score: Int = 0;

    constructor(scores : IntArray , scorePosition : Int){

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