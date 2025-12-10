


import java.util.HashMap;
import java.util.Map;


public  class ConfigManager {

    private final Map<String, Map<String, Object>> configurations;
    private  LoadConfgs loadConfgs;


    public ConfigManager(LoadConfgs loadConfgs) {
        configurations = new HashMap<>();
        this.loadConfgs = loadConfgs;
    }






    public Map<String, Object> getConfigurations(String className) {

        configurations.put(className,loadConfgs.getConfgs(loadConfgs.makePath(className)));

        return configurations.getOrDefault(className, new HashMap<>());
    }
}
