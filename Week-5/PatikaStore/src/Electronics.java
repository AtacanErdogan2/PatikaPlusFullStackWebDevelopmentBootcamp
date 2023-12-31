public abstract class Electronics {
    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int unitInStock;
    private Brand brand;
    private int storage;
    private int ram;
    private double screenSize;


    public Electronics(String name, double price, double discountRate, int unitInStock, Brand brand, int storage, int ram, double screenSize) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.unitInStock = unitInStock;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.screenSize = screenSize;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

}