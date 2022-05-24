package Code;

public class Child extends Person {

    void eat() {
    }

    void think() {
    }

    void Vote() {
        throw new Error("Несовершенолетние не могут голосовать");
    }
}
