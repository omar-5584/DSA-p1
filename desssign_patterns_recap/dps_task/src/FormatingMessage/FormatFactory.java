package FormatingMessage;

import Users.ProUser;
import Users.*;

public class FormatFactory {
public static MessageFormat  createMessageFormat(User user){
    return switch (user) {
        case ProUser p -> new HTMLFormat();
        case TraditionalUser t -> new TEXTFormat();
        default -> null;
    };
}


}
