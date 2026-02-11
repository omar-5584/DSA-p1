package Users;

public class TraditionalUser implements User{
    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public boolean hasMobileApp() {
        return false;
    }

    @Override
    public String getDeviceId() {
        return "";
    }
}
