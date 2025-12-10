import java.nio.file.Paths;
import java.io.File;
import java.util.Map;

public interface LoadConfgs {


      String CONFIG_FOLDER_PATH = Paths.get("src",  "config").toFile().getAbsolutePath();

    Map<String, Object> getConfgs(File file);
     File makePath(String className);

}
