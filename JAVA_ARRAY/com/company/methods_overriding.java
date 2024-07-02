package com.company;
// methods overriding means  you use same name methods or function with 2 different purpose

class A {
    public int scout(){
        System.out.println("this is 1st method");
        return 1;
    }
    public int meth2(){
        System.out.println("this is 2nd method of A class ");
        // just like here meth2 is from which is totally different from meth2 from class b;

        return 1;
    }
}
class b extends A{
    @Override
    // it represents the overriding method;
    // it is not necessary

    public int meth2() {
        System.out.println("this is 2nd method from B class");
        return 1;
    }
}
public class methods_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        b B = new b();
        B.meth2();
    }

}
