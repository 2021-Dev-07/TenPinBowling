import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingGameTest {
    private var bowlingGame : BowlingGame? = null

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
            bowlingGame?.addRoll(1)
        }
        assertEquals(20, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testSpareScores() {
        bowlingGame?.addRoll(8)
        bowlingGame?.addRoll(2)
        bowlingGame?.addRoll(6)
        for(i in 1..17){
            bowlingGame?.addRoll(0)
        }
        assertEquals(22, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testStrikeScore() {
        bowlingGame?.addRoll(10)
        bowlingGame?.addRoll(2)
        bowlingGame?.addRoll(6)
        for(i in 1..17){
            bowlingGame?.addRoll(0)
        }
        assertEquals(26, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testScoresWithOpenFrames() {
        bowlingGame?.addRoll(4)
        bowlingGame?.addRoll(2)
        bowlingGame?.addRoll(5)
        bowlingGame?.addRoll(1)
        for(i in 1..16){
            bowlingGame?.addRoll(0)
        }
        assertEquals(12, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testScoreWithLastFrameSpare() {
        for(i in 1..18)
            bowlingGame?.addRoll(1)
        bowlingGame?.addRoll(5)
        bowlingGame?.addRoll(5)
        bowlingGame?.addRoll(3)
        assertEquals(31, bowlingGame?.getTotalScore())
    }


    @Test
    internal fun testScoreWithLastFrameStrike() {
        for(i in 1..18)
            bowlingGame?.addRoll(1)
        bowlingGame?.addRoll(10)
        bowlingGame?.addRoll(5)
        bowlingGame?.addRoll(3)
        assertEquals(36, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testPerfectGame() {
        for(i in 1..12)
            bowlingGame?.addRoll(10)
        assertEquals(300, bowlingGame?.getTotalScore())
    }
}