package Users;

public class ProUser implements User{
    @Override
    public String getEmail() {
        return "pro@gmail.com";
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
