package SD.DesignPattern.SingletonMethodDesignPattern;

class Singleton {

  // Static variable
  private static Singleton instance;

  // Private constructor
  private Singleton() {
      System.out.println("Instance Created");
  }

  // Public method to get instance
  public static Singleton getInstance() {
      if (instance == null) {
          instance = new Singleton();
      }
      return instance;
  }
}

public class Main {
  public static void main(String[] args) {

      Singleton obj1 = Singleton.getInstance();
      Singleton obj2 = Singleton.getInstance();

      System.out.println(obj1 == obj2); // true
  }
}