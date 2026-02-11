package ValidationAnswer;

import Notifications.NotificationWay;
import Users.User;
import UsersCollection.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ValidAns {


    public abstract boolean validate(String text);

    public void save(String text) {
        System.out.println("[DB] Answer saved: " + text);
    }

    public void notifyUsers(String text, User asker, List<NotificationWay>notificationWays) {
      usersCollection users=new usersCollection(notificationWays);
        Iterator<usersCollection> it=new myIterator(users);
while(it.hasNext()){
    ((myIterator) it).nextWithparam(text,asker);
}

}}
