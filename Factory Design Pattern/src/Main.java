
public class Main {

	public static void main(String[] args) {

		NotificationFactory nf=new NotificationFactory();
		Notification n=nf.createNotification("Email");
		n.notifyUser();
		
	}

}
