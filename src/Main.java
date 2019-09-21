public class Main{

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setQuackBehaviour(new Squeak());
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());  // this is where the changing of behaviours can be changed
        model.performFly();

    }
}