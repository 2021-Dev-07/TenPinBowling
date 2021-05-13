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
}