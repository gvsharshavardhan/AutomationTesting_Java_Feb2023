package Session_2;

public class Cardemo {

    public static void main(String[] args) {

        //constructor will be called whenever we create an object
       Car c1 = new Car();
       c1.setName("AUDI");
       Car.noOfWheels = 5;

       c1.drive(); //honda civic is driving on 5 wheels


       Car c2 = new Car("toyota corolla","25km/lit");
       c2.drive();//corolla is driving on 5 wheels

        System.out.println( Car.noOfWheels);

        Car c3 = new Car();
    }
}