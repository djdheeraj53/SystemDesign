public interface Builder {
    void buildCPU(String cpu);
    void buildRAM(String ram);
    void buildStorage(String storage);
    Computer getResult();
}