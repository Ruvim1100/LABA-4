import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartPrice> prices =  new ArrayList<>();
        prices.add(new Iphone());
        prices.add(new Oppo());
        prices.add(new Samsung());

        for (SmartPrice s: prices){
            s.printPrice();
        }

    }
}