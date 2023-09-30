class Smartphone extends Device {
    private int memory;

    public Smartphone(String type, double storage, double weight, String model, int memory) {
        super(type, storage, weight, model);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }
}