package Code;

public class Main {
    public static void main(String[] args) {
        rtr(new Child());
    }
    public static void rtr(Person person){
        person.Vote();
    }
}