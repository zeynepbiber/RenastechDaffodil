package code.day29_Inheritence_Owerrting.CarTask;

public class Toyota extends Car {

    //start ,stop ,consume will be inherited


    @Override
    public void consume() {
        System.out.println("Consume half electric half gas");
}
}
