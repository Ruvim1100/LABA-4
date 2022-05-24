public class Iphone implements SmartPrice{
    int price = 30000;

    @Override
    public void printPrice() {
        System.out.println(price);
    }
}
