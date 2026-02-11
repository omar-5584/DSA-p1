package FormatingMessage;

public class TEXTFormat implements MessageFormat {
    @Override
    public String format(String message) {
        System.out.println("[Email] Sending Text Format ");
       //logic of formating to text if there is.
        return message;
    }
}
