package UsersCollection;

import Notifications.NotificationWay;

public interface Collection {
    NotificationWay get(int idx);
    int size();
}
