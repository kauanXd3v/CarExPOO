public class Car {
    String name;
    String model;
    String color;
    int year;
    int calcYear;

    void technicSheet(){
        System.out.println("name is: " + name);
        System.out.println("model is: " + model);
        System.out.println("color is: " + color);
        System.out.println("year is: " + year);
    }

    int carYear(){
        calcYear =  2025 - year ;
        return calcYear;
    }

}
