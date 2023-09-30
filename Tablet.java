class Tablet extends Device {
    private boolean hasStylus;

    public Tablet(String type, double storage, double weight, String model, boolean hasStylus) {
        super(type, storage, weight, model);
        this.hasStylus = hasStylus;
    }

    public boolean hasStylus() {
        return hasStylus;
    }
}