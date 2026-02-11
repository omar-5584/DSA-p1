package ValidationAnswer;

public class ValidAnsFactory {
public  static ValidAns createValidAnswer( String portalType){
   return switch (portalType){

           case "Kids" -> new KidAns();
           default     -> new OthersAns();
       };
    };
}

