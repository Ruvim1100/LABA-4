package Code;

public class Terminal {
    int sum = 1000;
    String name = "Бозажи Рувим";

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Pay(){
        System.out.println("Перевод платежа");
    }

    void Report(){
        System.out.println("Транзакция в сумме " + sum + " Была переведена на счёт клиента " + name);
    }

    void Save(){
        System.out.println("Сохранение в Базе Данных");
    }

}
