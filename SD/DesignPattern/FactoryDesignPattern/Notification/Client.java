package SD.DesignPattern.FactoryDesignPattern.Notification;

interface Notification {
  void send();
}

class EmailNotification implements Notification {
  public void send() {
      System.out.println("Sending Email Notification");
  }
}

class SMSNotification implements Notification {
  public void send() {
      System.out.println("Sending SMS Notification");
  }
}

class PushNotification implements Notification {
  public void send() {
      System.out.println("Sending Push Notification");
  }
}

abstract class NotificationFactory {
  abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory {
  public Notification createNotification() {
      return new EmailNotification();
  }
}

class SMSFactory extends NotificationFactory {
  public Notification createNotification() {
      return new SMSNotification();
  }
}

class PushFactory extends NotificationFactory {
  public Notification createNotification() {
      return new PushNotification();
  }
}

class Client {

  public static void main(String[] args) {

      NotificationFactory factory;

      // Email
      factory = new EmailFactory();
      Notification n1 = factory.createNotification();
      n1.send();

      // SMS
      factory = new SMSFactory();
      Notification n2 = factory.createNotification();
      n2.send();

      // Push
      factory = new PushFactory();
      Notification n3 = factory.createNotification();
      n3.send();
  }
}

// without factory method
class NotificationService {

  public void sendNotification(String type) {

      if (type.equals("EMAIL")) {
          EmailNotification email = new EmailNotification();
          email.send();
      } 
      else if (type.equals("SMS")) {
          SMSNotification sms = new SMSNotification();
          sms.send();
      } 
      else if (type.equals("PUSH")) {
          PushNotification push = new PushNotification();
          push.send();
      }
  }
}