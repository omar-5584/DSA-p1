
import java.util.Map;
import java.util.Properties;

public class Database {
    private final String url;
    private final String username;
    private final String password;


    public Database() {
        Map<String, Object> configs = ConfigManager.getInstance().getConfigurations("Database",ConfgType.Properties);
        this.url = (String) configs.getOrDefault("database.url", "jdbc:default:url");
        this.username = (String) configs.getOrDefault("database.username", "default_user");
        this.password = (String) configs.getOrDefault("database.password", "default_password");
    }

    public void displayConfig() {
        System.out.println("Database Configuration:");
        System.out.println("  URL: " + url);
        System.out.println("  Username: " + username);
        System.out.println("  Password: " + password);
    }
}
