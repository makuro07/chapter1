package com.hspedu.oop;

/**
 * @author 張　暁竜
 * @version SE 11
 */
public class Filed01 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
//              p.name = "cls";
//        System.out.println(p);
    }
}
class Person{
    int age = 10;
   // public String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}