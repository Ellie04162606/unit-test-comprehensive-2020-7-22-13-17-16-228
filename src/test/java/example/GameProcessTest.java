package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameProcessTest {
    @Test
    void should_return_game_over_when_play_game_given_times_is_more_than_6(){

        //given
        int[] inputNumber ={1,3,4,5};
        GameProcess gameProcess = new GameProcess();
        gameProcess.setTimes(7);

        //when
        String result = gameProcess.playGame(gameProcess.getTimes(),inputNumber);

        //then
        assertEquals("The game is over", result);
    }
}
