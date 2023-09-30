class Device {
    private String type;
    private String model;
    private double storage;
    private double weight;

    public Device(String type, double storage, double weight, String model) {
        this.type = type;
        this.model = model;
        this.storage = storage;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public double getStorage() {
        return storage;
    }

    public double getWeight() {
        return weight;
    }
} 
 