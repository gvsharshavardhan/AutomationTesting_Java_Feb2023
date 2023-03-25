package Session_4.collections;

public class Car {

    String name;
    String milege;

    Car(String name, String milege){
        this.name = name;
        this.milege = milege;
    }

    public void driver() {
        System.out.println("driving");
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Car)obj).name.equals(this.name) && ((Car)obj).milege.equals(this.milege);
    }

    public static void main(String[] args) {

        Car c1 = new Car("bmw", "10lit/km");
        Car c2 = new Car("bmw","20lit/km");

        System.out.println(c1.equals(c2));//false

    }
}
