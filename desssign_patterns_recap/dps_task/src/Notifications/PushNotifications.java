package Notifications;

import FormatingMessage.FormatFactory;
import Users.User;

public class PushNotifications implements NotificationWay {
    public void notifys(String message, User user){
        if (user.hasMobileApp()) {
            System.out.println("[Push] To Device ID: " + user.getDeviceId());
        }
    }
}
