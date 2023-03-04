package Session_2;

public class Car {

    //attr -> var
    String name = "BMW";
    String mileage = "10km/lit";
    static int noOfWheels = 4; //static

    //name of the constructor should be same as class name
    //to init instance variables
    Car(String name, String mileage){
        this.name  = name;
        this.mileage = mileage;
    }

    Car(){

    }

    void setName(String name){
        this.name = name;
    }

    //beh -> methods
    void drive(){
        System.out.println(name + " is driving on " + noOfWheels +" wheels!!" );
    }
    void park(){
        System.out.println(name + " is getting parked");
    }

}