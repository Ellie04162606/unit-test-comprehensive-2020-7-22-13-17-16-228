package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class GameProcessTest {
    public int[] answer = {1, 2, 3, 4};

    @Test
    void should_return_game_over_when_play_game_given_times_is_more_than_6() {
        //given
        int[] inputNumber = {1, 3, 4, 5};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);
        for (int i = 0; i < 6; i++) {
            gameProcess.playGame(inputNumber);
        }

        //when
        String result = gameProcess.playGame(inputNumber);

        //then
        assertEquals("The game is over", result);
    }

    @Test
    void should_return_game_over_and_win_game_when_play_game_given_times_is_in_6() {

        //given
        int[] inputNumber = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);
        for (int i = 0; i < 5; i++) {
            gameProcess.playGame(inputNumber);
        }
        //when
        String result = gameProcess.playGame(inputNumber);

        //then
        assertEquals("The game is over, you are win.", result);
    }

    @Test
    void should_return_input_number_when_play_game_given_incorrect_number() {
        //given
        int[] inputNumber = {9, 2, 3, 4};
        int[] answer = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.playGame(inputNumber);

        //then
        assertEquals("3A0B", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_invalid_number_which_length_is_shorter_than_4() {
        //given
        int[] inputNumber = {1, 9};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.playGame(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_invalid_number_which_length_is_longer_than_4() {
        //given
        int[] inputNumber = {1, 9, 3, 4, 6};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.playGame(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_has_the_same_number() {
        //given
        int[] inputNumber = {1, 1, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.playGame(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }

    @Test
    void should_return_wrong_display_when_play_game_given_out_of_range() {
        //given
        int[] inputNumber = {-1, 11, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(generateAnswer);

        //when
        String result = gameProcess.playGame(inputNumber);
        //then
        assertEquals("Wrong Input,Input again", result);
    }
}
