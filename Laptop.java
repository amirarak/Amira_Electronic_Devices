class Laptop extends Device {
    private int batteryLife;

    public Laptop(String type, double storage, double weight, String model, int batteryLife) {
        super(type, storage, weight, model);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}