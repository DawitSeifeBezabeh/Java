public class Person{
    public static void main(String args[]){
            Student person1 = new Student();
            Teacher person2 = new Teacher();
    }
}
class Student{
    String sName;
    int sAge;
    char sGender;

    Student(){
        this("hi", 26);
        if(sAge > 25){
            sGender = 'A';
        }
        System.out.println(sGender);
    }
    Student(int a){
        sAge = a;
        System.out.println("123");
    }
    Student(String s, int a){
        this(a);
        System.out.println("456");
    }
}
class Teacher{
    String tName;
    int tAge;
    char tGender;

    Teacher(){
        this("hi", 24);
        if(tAge > 25){
            tGender = 'A';
        }
        System.out.println(tGender);
    }
    Teacher(int a){
        tAge = a;
        System.out.println("098");
    }
    Teacher(String s, int a){
        this(a);
        System.out.println("765");
    }
}
// import java.lang.*;
// public class test2{
//     public static void main(String[] args){
//         Test t1 = new Test(11, 12);
//         // StudentInfo s1 = new StudentInfo();
//         // System.out.println(s1.age);

//         // Circle c1 = new Circle();
//         // c1.r = 4;
//         // double area = c1.area();
//         // double circum = c1.circumf();

//         // System.out.println("Area = " + area + ", Circumference = " + circum);
//     }
// }
// class Circle{
//     double x, y;
//     double r;

//     public double area(){
//         return (r*r);
//     }
//     public double circumf(){
//         return (2 * 3.14 * r);
//     }
// }
// class StudentInfo{
//     String name;
//     int age;
//     char gender;

//     public StudentInfo(){
//         age = 10;
//         // this.name = name;
//         // this.age = age;
//         // this.gender = gender;
//         // System.out.println(name + " " +age + " " + gender);
//     }
// }
// class Test{
//     int i, j;
//     public Test(int i, int j){
//         this.i *= 2;
//         this.j /= 3;
//         System.out.println(i + " " + j);
//     }
// }

// public class Person {
// int age;
// String s = new String("null");
// Person(int a) {
// age = a;
// System.out.println("Constructorwithintargonly, Age="+age);}
// Person(String ss) {
// System.out.println("ConstructorwithStringarg only,s="+ss);s = ss;
// }
// Person(String s, int a) {
// this(a);
// this.s = s; // Another useof"this"
// System.out.println("String&intargs");}
// Person() {
// this("hi"
// , 47);
// System.out.println("defaultconstructor(no args)");}
// void print() {
// System.out.println("Age ="+age+"s="+s);}
// public static void main(String[]args){Person x = new Person();
// x.print();
// }
// }
    
    