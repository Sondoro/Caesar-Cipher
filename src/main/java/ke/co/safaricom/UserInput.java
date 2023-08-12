package ke.co.safaricom;

public class UserInput {
    private int key;
    private String message;
    private int option; // 1-encode, 2-decode, 3-exit

    public UserInput() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }


}
