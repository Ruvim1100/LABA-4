import java.util.ArrayList;
import java.util.Objects;

public class NMain {
    public static void main(String[] args) {
        ArrayList<Smartphone> top = new ArrayList<>();
        Smartphone smartphone1 = new Smartphone(11000, "Samsung");
        Smartphone smartphone2 = new Smartphone(22000, "Iphone");
        Smartphone smartphone3 = new Smartphone(22000, "Iphone");
        Smartphone smartphone4 = new Smartphone(10000,  "Oppo");


        top.add(smartphone1);
        top.add(smartphone2);
        top.add(smartphone3);
        top.add(smartphone4);

        for (Smartphone s: top){
            if (Objects.equals(s.getModel(), "Iphone")){
                s.setPrice(30000);
                System.out.println(s);
            }
            else if (Objects.equals(s.getModel(), "Samsung")){
                s.setPrice(10000);
                System.out.println(s);
            }
            else if (Objects.equals(s.getModel(), "Oppo")){
                s.setPrice(2000);
                System.out.println(s);
            }
            else{
                System.out.println("Нет соответствующего товара");
            }
        }

    }
}