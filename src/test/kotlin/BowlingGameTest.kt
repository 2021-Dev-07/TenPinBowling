import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingGameTest {
    var bowlingGame : BowlingGame? = null
    @BeforeEach
    internal fun setUp() {
        bowlingGame = BowlingGame()
    }

    @AfterEach
    internal fun tearDown() {

    }

    @Test
    internal fun testAllScores() {
        for(i in 1..20){
            bowlingGame?.addScore(1)
        }
        assertEquals(20, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testSpareScores() {
        bowlingGame?.addScore(8)
        bowlingGame?.addScore(2)
        bowlingGame?.addScore(6)
        for(i in 1..17){
            bowlingGame?.addScore(0)
        }
        assertEquals(22, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testStrikeScore() {
        bowlingGame?.addScore(10)
        bowlingGame?.addScore(2)
        bowlingGame?.addScore(6)
        for(i in 1..17){
            bowlingGame?.addScore(0)
        }
        assertEquals(26, bowlingGame?.getTotalScore())
    }
}