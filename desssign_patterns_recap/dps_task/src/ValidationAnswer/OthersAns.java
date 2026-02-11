package ValidationAnswer;

public class OthersAns extends ValidAns{

    @Override
    public boolean validate(String text) {

        if (text.contains("bad_word")) {
            System.out.println("Blocked: Profanity detected.");
        return false;

        }
        return true;
    }
}
