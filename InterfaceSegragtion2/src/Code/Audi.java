package Code;

public class Audi implements Detalis{
    String num = "RYW200";
    String type = "Petrol";

    String engine = "V8";
    String carburetor = "CVBNVN";

    @Override
    public void getCarburetor() {
        System.out.println(carburetor);
    }

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    @Override
    public void getNum() {
        System.out.println(num);
    }
}
