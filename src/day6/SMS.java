package day6;

	class Notification {
	    void sendMessage() {
	        System.out.println("Sending a notification.");
	    }
	}

	class EmailNotification extends Notification {
	    @Override
	    void sendMessage() {
	        System.out.println("Sending an email notification.");
	    }
	}

	class SMSNotification extends Notification {
	    @Override
	    void sendMessage() {
	        System.out.println("Sending an SMS notification.");
	    }
	}

	public class SMS {
	    public static void main(String[] args) {
	        Notification message;

	        message = new EmailNotification();
	        message.sendMessage();

	        message = new SMSNotification();
	        message.sendMessage();
	    }
	}

