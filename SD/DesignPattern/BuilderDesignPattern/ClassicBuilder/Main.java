public class Main {
    public static void main(String[] args) {

        Builder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(builder, "Ryzen 9", "64GB", "2TB SSD");

        Computer computer = builder.getResult();
        computer.displayInfo();
    }
}