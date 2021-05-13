import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FrameTest {

    var frame : Frame? = null

    @BeforeEach
    internal fun setUp() {
    }


    @AfterEach
    internal fun tearDown() {
        frame = null
    }

    fun addScores(score : Int, from : Int , count : Int) : IntArray{
        var scores = IntArray(21)
        for (i in from until count){
            scores[i] = score
        }
        return scores;
    }

    @Test
    internal fun testOpenFrameScore() {
        var scores = addScores(0, 2, 20)
        scores[0] = 3
        scores[1] = 2
        frame = Frame(scores, 0)
        assertEquals(5, frame?.getscore())
    }

    @Test
    internal fun testSpareFrameScore() {
        var scores = addScores(0, 3, 20)
        scores[0] = 3
        scores[1] = 7
        scores[2] = 5
        frame = Frame(scores, 0)
        assertEquals(15, frame?.getscore())
    }

    @Test
    internal fun testStrikeFrame() {
        var scores = addScores(0, 3, 20)
        scores[0] = 10
        scores[1] = 4
        scores[2] = 5
        frame = Frame(scores, 0)
        assertEquals(19, frame?.getscore())
    }
}