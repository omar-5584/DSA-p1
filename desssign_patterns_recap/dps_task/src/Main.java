import Notifications.EmailNotify;
import Notifications.NotificationWay;
import Notifications.SMSNotify;
import Users.ProUser;
import Users.UserFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

ArrayList<NotificationWay>myarr=new ArrayList<>();
myarr.add(new EmailNotify());
myarr.add(new SMSNotify());

AnswerService answerService=new AnswerService(myarr);
answerService.processAnswer("OK", UserFactory.createUser(5),"Kids");

}
