public class Smartphone {
    int price;
    String model;

    public Smartphone(int price, String model){
        this.price = price;
        this.model = model;
    }

    public Smartphone() {
        this.price = 0;
        this.model = null;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
