package Notifications;

import Users.User;

public class SMSNotify implements NotificationWay {
    public void notifys(String message, User user){

        // logic of formating sms if differ like email
        System.out.println("sms notifying successfully");

    }
}
