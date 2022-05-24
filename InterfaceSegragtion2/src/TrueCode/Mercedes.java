package TrueCode;

public class Mercedes implements DetalisDiesel {
    String num = "TTR153";
    String type = "Diesel";

    String engine = "JTD";

    @Override
    public void getNum() {
        System.out.println(num);
    }
}
