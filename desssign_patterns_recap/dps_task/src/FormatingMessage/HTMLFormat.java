package FormatingMessage;

public class HTMLFormat implements MessageFormat {


    public String format(String message) {
     //logic of formating message as html
         System.out.println("[Email] Sending HTML Format" );
        return message;
    }
}
