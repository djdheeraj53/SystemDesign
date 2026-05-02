package SD.DesignPattern.SingletonMethodDesignPattern;

// class Singleton {

//   private static Singleton instance;

//   private Singleton() {
//       System.out.println("Instance Created");
//   }

//   public static synchronized Singleton getInstance() {
//       if (instance == null) {
//           instance = new Singleton();
//       }
//       return instance;
//   }
// }

class Singleton {

  private static volatile Singleton instance;

  private Singleton() {
      System.out.println("Instance Created");
  }

  public static Singleton getInstance() {

      if (instance == null) { // First check
          synchronized (Singleton.class) {

              if (instance == null) { // Second check
                  instance = new Singleton();
              }
          }
      }
      return instance;
  }
}

public class ThreadMain {
  public static void main(String[] args) {

    Runnable task = () -> {
      Singleton obj = Singleton.getInstance();
      System.out.println(obj.hashCode());
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();
  }
}
