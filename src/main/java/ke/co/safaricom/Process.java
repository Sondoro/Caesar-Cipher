package ke.co.safaricom;

public class Process {
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encode(String message, int key) {
        char[] chars = message.toCharArray();
        String output = "";
        for(char c: chars){
            int position = ALPHABETS.indexOf(c);
            int newPosition = position + key;
            char replacement = ALPHABETS.charAt(newPosition);
            output = output + replacement;
        }
        return output;
    }

        public static String decode(String message, int key) {
            char[] chars = message.toCharArray();
            String output = "";
            for(char c: chars){
                int position = ALPHABETS.indexOf(c);
                int newPosition = position - key;
                char replacement = ALPHABETS.charAt(newPosition);
                output = output + replacement;
            }
            return output;
    }

    public static String run(UserInput userInput) {
        if (userInput.getProcess() == 1){
            return encode(userInput.getMessage(), userInput.getKey());
        } else if (userInput.getProcess() == 2) {
            return decode(userInput.getMessage(), userInput.getKey());
        } else {
            return null;
        }
    }


}
