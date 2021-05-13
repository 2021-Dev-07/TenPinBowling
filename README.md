# TenPinBowling
Ten Pin bowling kata done in TDD approach

_It's a simple bowling game kata. If the user input some valid score sequence of bowling game, program will generate the total score of the whole game. It's a very simple program uses two classes **Frame.kt** and **BowlingGame.kt**

**Frame.kt** class will manage each Frame scores. It finds the spare/strike/open frame scores from the gives score list. Also manages to find the bonus scores for the spare and strike. Finally it provides the total score of the individual frame

**BowlingGame.kt** will provides the utility methods to addScore and total score of the whole game.
Total score will be calculated by adding all frame scores

**How to run the program ?**
To run the program, just run the main() in the BowlingGame.kt. Program will ask for the valid score sequence to enter. Enter Score [ex: 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- ]. Program will produce the total score_
