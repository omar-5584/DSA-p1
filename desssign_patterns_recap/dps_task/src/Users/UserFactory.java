package Users;

public class UserFactory {
    public static User createUser(int fund){
        User user;
        switch(fund){
            case 50://example of pro user
                user = new ProUser();
                break;
            default:user=new TraditionalUser();
        }
        return user;
    }
}
