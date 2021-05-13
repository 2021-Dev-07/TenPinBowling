import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FrameTest {

    var frame : Frame? = null
    var scores  = IntArray(21)

    @BeforeEach
    internal fun setUp() {
    }


    @AfterEach
    internal fun tearDown() {
        frame = null
    }

    fun addScores(score : Int){
        for (i in 1..20){
            scores[i] = score
        }
    }

    @Test
    internal fun testAddScore() {
        addScores(5)
        frame = Frame(scores, 0)
        assertEquals(5, frame?.getscore())
    }

    @Test
    internal fun testOpenFrameScore() {
       /* frame?.addScore(3)
        frame?.addScore(2)*/
        assertEquals(5, frame?.getscore())
    }

    @Test
    internal fun testSpareFrameScore() {
        //frame?.addScore(8, 2, 3)
        assertEquals(13, frame?.getscore())
    }

    @Test
    internal fun testStrikeFrame() {
        //frame?.addScore(10, 2, 3)
        assertEquals(15, frame?.getscore())
    }
}