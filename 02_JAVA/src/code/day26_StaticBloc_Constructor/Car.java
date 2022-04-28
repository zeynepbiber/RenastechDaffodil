package code.day26_StaticBloc_Constructor;

public class Car {

   // Even if you don't create one constructor java will create one as default.

    // instance variables
    String brand;
    int year;
    double price;
    String color;

    public Car(String brand, int year, double price, String color){ // 4 parameters
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;
    }

    public Car(String brand, int year){// 2 parameters

        this.brand=brand;
        this.year=year;

    }

    // convert object to String and will return object as String.
    public String toString(){
        return year+" , "+brand+" , "+color+" , "+price;
    }


    public void getCarBrandAndYear(){
        System.out.println("brand is " +brand);
        System.out.println("Year is " + year);
    }




}
