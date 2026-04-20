public class ComputerDirector {
    public void construct(Builder builder, String cpu, String ram, String storage) {
        builder.buildCPU(cpu);
        builder.buildRAM(ram);
        builder.buildStorage(storage);
    }
}