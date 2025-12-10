public class PropertiesConfigManager extends ConfigManager{
    private static PropertiesConfigManager instance;

    private  PropertiesConfigManager () {
        super(new LoadProperties());
    }
    public static PropertiesConfigManager getInstance() {
           if(instance == null)
            {
                synchronized (LoadProperties.class)
                {
                    if(instance == null)
                    {
                        instance = new PropertiesConfigManager();
                    }
                }

            }
            return instance;

    }
}
