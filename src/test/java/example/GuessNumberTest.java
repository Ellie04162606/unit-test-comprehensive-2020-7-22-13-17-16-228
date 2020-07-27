package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class GuessNumberTest {
    public int[] answer = {1, 2, 3, 4};

    @Test
    void should_return_4A0B_when_guess_number_given_correct_number() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_completely_mismatched_number() {
        //given
        int[] inputNumber = {5, 6, 7, 8};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_all_correct_number_with_completely_incorrect_place() {
        //given
        int[] inputNumber = {4, 3, 2, 1};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_1A3B_when_guess_number_given_all_correct_number_with_sectional_correct_place() {
        //given
        int[] inputNumber = {1, 4, 2, 3};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A3B", result);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_sectional_correct_number_with_completely_disMatch_place() {
        //given
        int[] inputNumber = {3, 4, 6, 8};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_2A0B_when_guess_number_given_sectional_correct_number_in_correct_place() {
        //given
        int[] inputNumber = {1, 9, 3, 8};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessNumber guessNumberGame = new GuessNumber(generateAnswer);

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("2A0B", result);
    }
}
