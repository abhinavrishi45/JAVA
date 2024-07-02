package com.company.Interfaces;


interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();

}
//class  childSampleInterface extends sampleInterface{ ------->


// agar tumne  interface use kiya h clss ko define ke liye toh tum class ka use nhi kr skte kyuki wo sbko define krne ko bolega


  //  void meth3();
//    void meth4();
//}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class interfaces_in_inheritance {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}


