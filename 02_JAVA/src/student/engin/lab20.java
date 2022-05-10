package student.engin;

public class lab20 {
}


// Four OOP principles:


/*

In order to understand OOP we need to understand what is an Object.
And to understand Objects, we need to understand primitive datas, byte, int, char..
Primitive datas store certain kind of data. When programmig was simple back in time and developing.
Many programs was not complex compared today's codes. Thus programmers could get away only using primitive types.
As programs became larger and more complex primitive data types was not enough any more.

Then grouping the same type data together saved the day, Arrays.
But Arrays only contains the same type of data.
However Structures, Classes, can store any type of data. Even Structure in Structure.

Example: 
Russia vs Ukraine

Power Structure: 
Nucleer; soldier; tank; FighterJet; 
    Power SubStructure:
    Nucleer (Range-demage); 
    Tank (range-demage); 
    FighterJet (range-demage-speed-stealth-maneuver);

Allies Structure: Nato, Chine, Europe, Turkey

Soft Power Structure: Allies citizens, Non-Allies Citizens



*/

// Encapsulation:
//        * Refers to bundling data with methods that can operate on that data within a class.
//        * It’s the idea of hiding data within  a class, preventing anything outside that class directly interacting with it.
//        * Keeps the programmer in control of access to data.
//        * Prevents the programmer from ending up in any strange or unwanted states.
// We hide data with private keyword. Still we can access private data by getter and setter methods.
// 

// Abstraction:
//        * Refers to the idea to only showing essential details and keeping everything else hidden.
//        * The classes you create should act like your car. Users of your classes should not worry 
//        about the inner details of those classes.
//        * This is very important when working on your program incrementally.
// We care about interface here, NOT the implementation behind the hood.
       
// Inheritance:
//        * Is the principle that allows classes to derive from other classes.
// extendind classes is the key concept here. Access modifiers are public, private..


// Polymorphism:
//        * Describes methods that are able to take on many forms.
//        * Allows methods to take on many different forms.
//        * Be sure that you are calling the correct form of the method.
//        * There are two types of polymorphism: 
//         	** Dynamic polymorphism: 
//                	- Occurs during the runtime of the program.
//           		- Describes when a method signature is in both subclass and a superclass.
//         		- The methods share the same name but have different implementation.
//              		- The implementation of the subclass that the object is an instance of 
//                    	overrides that of the superclass.
//          ** Static polymorphism:
//           		-  Occurs during compile-time rather than during runtime.
//            		-  Refers to when multiply methods with the same name but different arguments
//             		   are defined in the same class.
//            		-  The parameters are different type or taken in different order.
//            		-  This is known as method overloading.