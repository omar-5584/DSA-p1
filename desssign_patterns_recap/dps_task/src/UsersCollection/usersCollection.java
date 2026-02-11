package UsersCollection;

import Notifications.NotificationWay;

import java.util.List;

public class usersCollection implements Collection {

    private List<NotificationWay> users;

    public usersCollection(List<NotificationWay> users) {
        this.users = users;
    }

    @Override
    public NotificationWay get(int idx) {
        return users.get(idx);
    }

    @Override
    public int size() {
        return users.size();
    }
}
