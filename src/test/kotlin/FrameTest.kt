import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FrameTest {

    var frame : Frame? = null

    @BeforeEach
    internal fun setUp() {
        frame = Frame()
    }

    @AfterEach
    internal fun tearDown() {
        frame = null
    }

    @Test
    internal fun testAddScore() {
        frame?.addScore(5)
        assertEquals(5, frame?.getscore())
    }

    @Test
    internal fun testOpenFrameScore() {
        frame?.addScore(3)
        frame?.addScore(2)
        assertEquals(5, frame?.getscore())
    }
}