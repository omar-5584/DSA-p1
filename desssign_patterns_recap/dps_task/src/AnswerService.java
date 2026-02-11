import Notifications.NotificationWay;
import Users.User;

import ValidationAnswer.*;

import java.util.ArrayList;
import java.util.List;

public class AnswerService {

public final List <NotificationWay> notificationWays;

    public AnswerService(List<NotificationWay> notificationWays) {
        this.notificationWays = notificationWays;
    }

    public void processAnswer(String answerText, User user, String portalType)
    {
        ValidAns ans= ValidAnsFactory.createValidAnswer(portalType);


        if(!ans.validate(answerText))
        {
            return;
        }

        ans.save(answerText);
        ans.notifyUsers(answerText, user,notificationWays);


    }
}
