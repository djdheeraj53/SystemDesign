public class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCPU(String cpu) {
        computer.setCPU(cpu);
    }

    public void buildRAM(String ram) {
        computer.setRAM(ram);
    }

    public void buildStorage(String storage) {
        computer.setStorage(storage);
    }

    public Computer getResult() {
        return computer;
    }
}