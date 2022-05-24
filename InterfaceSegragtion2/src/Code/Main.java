package Code;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();

        audi.getCarburetor();
        audi.getNum();

        bmw.getCarburetor();
        bmw.getNum();

        mercedes.getNum();
    }
}