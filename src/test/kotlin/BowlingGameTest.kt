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

    @Test
    internal fun testScoresWithOpenFrames() {
        bowlingGame?.addScore(4)
        bowlingGame?.addScore(2)
        bowlingGame?.addScore(5)
        bowlingGame?.addScore(1)
        for(i in 1..16){
            bowlingGame?.addScore(0)
        }
        assertEquals(12, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testScorewithLastFrameSpare() {
        for(i in 1..18)
            bowlingGame?.addScore(1)
        bowlingGame?.addScore(5)
        bowlingGame?.addScore(5)
        bowlingGame?.addScore(3)
        assertEquals(31, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testScoreWithlastFrameStrike() {
        for(i in 1..18)
            bowlingGame?.addScore(1)
        bowlingGame?.addScore(10)
        bowlingGame?.addScore(5)
        bowlingGame?.addScore(3)
        assertEquals(36, bowlingGame?.getTotalScore())
    }

    @Test
    internal fun testPerfectGame() {
        for(i in 1..12)
            bowlingGame?.addScore(10)
        assertEquals(300, bowlingGame?.getTotalScore())
    }
}