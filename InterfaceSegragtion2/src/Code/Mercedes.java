package Code;

public class Mercedes implements Detalis{
    String num = "TTR153";
    String type = "Diesel";

    String engine = "JTD";


    @Override
    public void getCarburetor() {
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
