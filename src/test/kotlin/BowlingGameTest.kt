import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingGameTest {
    var bowlingGame : BowlingGame? = null
    @BeforeEach
    internal fun setUp() {
        bowlingGame = BowlingGame()
    }

    @Test
    internal fun testAllScores() {
        for(i in 1..20){
            bowlingGame?.addScore(3)
        }
        assertEquals(3, bowlingGame?.getTotalScore())
    }
}