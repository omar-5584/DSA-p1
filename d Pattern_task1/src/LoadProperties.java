import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LoadProperties implements LoadConfgs{

    private LoadProperties instace = null;

    public LoadProperties gitInstace() {

        if(instace == null)
        {
            synchronized (LoadProperties.class)
            {
                if(instace == null)
                {
                    instace = new LoadProperties();
                }
            }

        }
        return instace;
    }

    Map<String, Object> info=new HashMap<>();
    @Override
    public Map<String, Object>  getConfgs(File file) {


        Map<String, Object> propertiesMap = null;
        try (FileReader reader = new FileReader(file)) {
            Properties properties = new Properties();
            properties.load(reader);
            propertiesMap = new HashMap<>();
            for (String key : properties.stringPropertyNames())
                propertiesMap.put(key, properties.getProperty(key));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return propertiesMap;
    }
     public File makePath(String className)
     {

         File file = new File(new StringBuilder(CONFIG_FOLDER_PATH)
                 .append(File.separator)
                 .append(className)
                 .append(".properties")
                 .toString());




         return file;
     }



}
