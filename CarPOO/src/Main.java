//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Mercedes";
        car.model = "C180";
        car.year = 2023;
        car.color = "Black";

        car.technicSheet();
        int calcyear = car.carYear();
        System.out.println(calcyear);
    }
}