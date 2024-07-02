package com.company.Interfaces;
interface bicycle{
    int a = 45; //[ Interfaces mei properties access kr skte h , but user input is not allowed in interfaces ;
    // here int a =  45 ; it is always fixed if we run in main through the change in 'a' we get an error;
    void speedUp(int increment);
    void speedDown(int decrement);
}
interface blowHorn{
    void button(int click);


}
class avon implements bicycle , blowHorn{
    void blowhorn(){
        System.out.println("tring tring");
    }
    public void speedUp(int increment){
        System.out.println("Acccl^n");

    }
    public void speedDown(int decrement){
        System.out.println("Deaccl^n");
    }

    public void button(int click) {
        System.out.println("tanannan ni na re na re na re na");
    }
}
public class interfaces {
    public static void main(String[] args) {
        avon first = new avon();
        first.speedDown(5);
    }
}
