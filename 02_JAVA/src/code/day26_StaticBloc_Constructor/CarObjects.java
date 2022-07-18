package code.day26_StaticBloc_Constructor;

public class CarObjects {

    public static void main(String[] args) {

       // Car object1=new Car();

        Car_nedenthis abesCar= new Car_nedenthis("Suziki",1999,10000.0,"White");
        // Constrcutor will help us to create an object of the class and updated attributes.

        System.out.println(abesCar.color); // White
        System.out.println(abesCar.brand); //Suziki
        System.out.println(abesCar.price); //10000.0
        System.out.println(abesCar.year); // 1999

        System.out.println(abesCar); // toString.
        // 1999 , Suziki , White , 10000.0

        System.out.println("++++++++++++++++++++++++++++++++++++");
        Car_nedenthis libbysCar=new Car_nedenthis("Ford",2016,150000,"White");

        System.out.println(libbysCar.year); //2016
        System.out.println(libbysCar.price); // 150000.0
        System.out.println(libbysCar.brand);// Ford

        System.out.println(libbysCar); //2016 , Ford , White , 150000.0

        System.out.println("***********************");

        libbysCar.getCarBrandAndYear();
        //brand is Ford
        //Year is 2016


        abesCar.getCarBrandAndYear();
        //brand is Suziki
        //Year is 1999


        System.out.println("*********************");

        Car_nedenthis berkanCar=new Car_nedenthis("Honda",2019);
        // here we created an object with 2 parameters.

        System.out.println(berkanCar.brand);//Honda
        System.out.println(berkanCar.year); //2019

        System.out.println(berkanCar.color); //null
        System.out.println(berkanCar.price);//0.0


        System.out.println("******************");

        Car_nedenthis car4=new Car_nedenthis("Audi",1990,90.0,"Black");

        System.out.println(car4.color);



    }
}
