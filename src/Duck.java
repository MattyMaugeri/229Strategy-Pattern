public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehvaiour quackBehaviour;

    public Duck() {

    }

    public void setFlyBehaviour(FlyBehaviour fb) {     // both set methods are responsible for changing
        flyBehaviour = fb;                             // behavior dynamically
    }

    public void setQuackBehaviour(QuackBehvaiour qb) {
        quackBehaviour = qb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("I am Swimming");
    }

    public abstract void display();
}