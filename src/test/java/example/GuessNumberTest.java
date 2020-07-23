package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_number_given_correct_number(){
        //given
        int[] inputNumber = {1,2,3,4};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_completely_mismatched_number(){
        //given
        int[] inputNumber = {5,6,7,8};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A0B",result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_all_correct_number_with_completely_incorrect_place(){
        //given
        int[] inputNumber = {4,3,2,1};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("0A4B",result);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_all_correct_number_with_sectional_correct_place(){
        //given
        int[] inputNumber = {1,4,2,3};
        GuessNumber guessNumberGame = new GuessNumber();

        //when
        String result = guessNumberGame.guessNumber(inputNumber);
        //then
        assertEquals("1A3B",result);
    }
}
