package UsersCollection;

import Users.User;

public class myIterator implements java.util.Iterator {

    private usersCollection users;
    private int index=0;
    public myIterator(usersCollection users) {
        this.users = users;
    }
    @Override
    public boolean hasNext() {
        return index<users.size();
    }

    @Override
    public Object next() {
        return null;
    }


    public void nextWithparam(String message, User user) {
         users.get(index).notifys(message,user);
         index++;
    }
}
