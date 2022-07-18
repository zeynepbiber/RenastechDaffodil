package code.day25_StaticKeyword;

public class c6_StaticBlock {
    //in java we have class members : class , method , variables
    //optinal you can create a block

    int instanceVariable = 10;
    static  int staticVariable=20;

    public static void main(String[] args) {//static method

        System.out.println("This is main method ");//2
        System.out.println("this is something I added after must be 3 but delete so numbers make sense!");

        methodStat();//3
//        methodInstance()
        c6_StaticBlock obj1=new c6_StaticBlock();
        obj1.methodInstance();//5

        c6_StaticBlock obj2=new c6_StaticBlock();
        obj2.methodInstance();//7
    }

    public static void methodStat(){
        System.out.println("Static Method");
    }

    public void methodInstance(){
        System.out.println("Instance method");
    }


    //blocks
    {
        //instance block
        System.out.println("This is instance block");//4//6
    }

    static {
        System.out.println("Static Block");//1
    }

    //instance block : will be executed for any new object
    //static block : will be executed once before everything


}
