package Code;

public class BMW implements Detalis{
    String num = "MVM191";
    String type = "Petrol";

    String engine = "V8";
    String carburetor = "SherryBerg";

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
