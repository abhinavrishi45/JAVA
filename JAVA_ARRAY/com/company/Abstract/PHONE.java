package com.company.Abstract;
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

//It cannot be instantiated.
//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.

abstract class nokia {
    public nokia() {
        System.out.println("Rough and Tough");
    }
    public void battery(){
        System.out.println(" very heavy");

    }
    abstract public void screen();
    abstract public void speakers();



}

class Samsung extends nokia{


    @Override
    public void screen() {
        System.out.println("Better than nokia");

    }

    @Override
    public void speakers() {
        System.out.println("silghly lower than nokia");

    }
}
class Apple extends nokia{

    @Override
    public void screen() {
        System.out.println("very much better than nokia as well as samsung");
    }

    @Override
    public void speakers() {
        System.out.println("very powerful and loud");

    }
}
abstract class Lava{
    public void hang(){
        System.out.println("Absolutely");
    }
}
public class PHONE {
    public static void main(String[] args) {
        Apple iphone6 = new Apple();
       // nokia s2210 = new nokia();
       // s2210.speakers();
      //  Lava iball = new Lava();
    }
}
