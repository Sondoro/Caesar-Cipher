package ke.co.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    @Test
    @DisplayName("Test if encoding is working")
    void testEncoding(){
        UserInput userInput = new UserInput();
        userInput.setProcess(1);
        userInput.setMessage("A");
        userInput.setKey(1);
        String output = Process.run(userInput);
        assertEquals("B", output);

    }

    @Test
    @DisplayName("Test if decoding is working")
    void testDecoding(){
        UserInput userInput = new UserInput();
        userInput.setProcess(2);
        userInput.setMessage("B");
        userInput.setKey(1);
        String output = Process.run(userInput);
        assertEquals("A", output);

    }

    @Test
    @DisplayName("Test if code for identifying invalid process works ok")
    void testInvalidProcess(){
        UserInput userInput = new UserInput();
        userInput.setProcess(3);
        userInput.setMessage("B");
        userInput.setKey(1);
        String output = Process.run(userInput);
        assertEquals(null, output);

    }

}