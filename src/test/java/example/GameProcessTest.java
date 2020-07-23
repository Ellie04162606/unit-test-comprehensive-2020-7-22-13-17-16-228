package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameProcessTest {
    @Test
    void should_return_game_over_when_play_game_given_times_is_more_than_6() {

        //given
        int[] inputNumber = {1, 3, 4, 5};
        GameProcess gameProcess = new GameProcess();
        gameProcess.setTimes(7);

        //when
        String result = gameProcess.playGame(gameProcess.getTimes(), inputNumber);

        //then
        assertEquals("The game is over", result);
    }

    @Test
    void should_return_game_over_and_win_game_when_play_game_given_times_is_in_6() {

        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        gameProcess.setTimes(4);

        //when
        String result = gameProcess.playGame(gameProcess.getTimes(), inputNumber);

        //then
        assertEquals("The game is over, you are win.", result);

    }
}
