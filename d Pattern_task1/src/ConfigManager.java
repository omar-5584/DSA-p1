


import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public  class ConfigManager {
    String CONFIG_FOLDER_PATH = Paths.get(  "config").toFile().getAbsolutePath();
    private final Map<String, Map<String, Object>> configurations;
    private  static ConfigManager Instance;




    private ConfigManager() {
        configurations = new HashMap<>();

    }

     public static ConfigManager getInstance(){

        if(Instance==null){
            synchronized (ConfigManager.class){
                if(Instance==null){

                    Instance=new ConfigManager();
                }
            }
        }
        return Instance;
     }






    public Map<String, Object> getConfigurations(String className,ConfgType confgType) {

        LoadConfgs loader=confgsFactory.create(confgType);
        configurations.put(className,loader.getConfigurations(new StringBuilder(CONFIG_FOLDER_PATH)
                .append(File.separator)
                .append(className)
                .append(".properties")
                .toString()));

        return configurations.getOrDefault(className, new HashMap<>());
    }
}
