public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("32GB")
                .build();

        computer.displayInfo();
    }
}