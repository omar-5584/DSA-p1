package Notifications;

import FormatingMessage.FormatFactory;
import FormatingMessage.MessageFormat;
import Users.User;

public class EmailNotify implements NotificationWay {


    public void notifys(String message, User user){
        MessageFormat messageFormat= FormatFactory.createMessageFormat(user);
        messageFormat.format(message);
        System.out.println("email notifying successfully");
    }
}
