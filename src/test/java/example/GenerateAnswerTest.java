package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateAnswerTest {
    @Test
    void should_return_answer_with_4_length_when_generate_answer(){
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();

        //when
        int[] result = generateAnswer.generate();
        //then
        assertEquals(4, result.length);
    }
}
