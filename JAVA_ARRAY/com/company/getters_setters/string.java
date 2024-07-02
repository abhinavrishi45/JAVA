package com.company.getters_setters;
class Myemp{
    String name;
    int age;
    int sallary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount() {
        return sallary;
    }

    public void setAmount(int amount) {
        this.sallary = amount;
    }
}
public class string {
    public static void main(String[] args) {
        Myemp rishi = new Myemp();
        rishi.age=5;
        rishi.name =" ric";
        rishi.sallary = 45;
        System.out.println(rishi.age);

    }

}
