package ValidationAnswer;

public class KidAns extends ValidAns{
    @Override
    public boolean validate(String text) {

        if ( text.contains("slang")) {
            System.out.println("Blocked: Kids mode detects slang.");

        return false;
        }

        return true;
    }
}
