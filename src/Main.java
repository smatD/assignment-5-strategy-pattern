public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.planRoute("Home", "University", 6));

        navigator.setStrategy(new WalkStrategy());
        System.out.println(navigator.planRoute("Home", "University", 6));

        navigator.setStrategy(new CycleStrategy());
        System.out.println(navigator.planRoute("Home", "University", 6));
    }
}
