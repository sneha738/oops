// class Student{
//     String name;
//     int age;
//     void study(){
//         System.out.println(name+"is studying");
//     }
// }
// public class basic{
//     public static void main(String[] args){
//         Student s1=new Student();
//         Student s2=new Student();
//         s1.name="Sonali";
//         s1.age=21;
//         s2.name="sneha";
//         s2.age=21;
//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         s1.study();
//     }
// }


//constructor//

//Parmitrized constructor*/

// class Student{
//     String name;
//     int age;
//     Student(String name,int age){
//         this.name="Sneha";
//         this.age=21;
//     }
//     void study(){
//         System.out.println(name+"study");
//     }
// }
// public class basic{
//     public static void main(String[] args){
//         Student s1=new Student("Sneha", 21);
//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         s1.study();
//     }
// }

/*Encapsulation */

// class Bankaccount{
//     private double balance;

//     public double getBalance(){
//         return balance;
//     }
//     public void setBalance(double balance){
//          this.balance=balance;
//     }
// }
// public class basic {
//     public static void main(String[] args){
//         Bankaccount account=new Bankaccount();
//         account.setBalance(1000.24);
//         System.out.println(account.getBalance());

//     }
// }

// class Student{
//     private String name;
//     private int age;
//     public String getName(){
//         return name;

//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }
// }
// public class basic{
// public static void main(String[] args){
//     Student s1=new Student();
//     s1.setName("sonali");
//     s1.setAge(21);
//     System.out.println(s1.getName());
//     System.out.println(s1.getAge());


// }
// }

/* Inheritance */
// class Animal{
//     String name;
//     void eat(){
//         System.out.println(name + " is eating");
//     }
// }
// class dog extends Animal{
//     void bark(){
//         System.out.println(name + " ia barking");
//     }
//     dog(String name){
//         this.name=name;
//     }
// } 
// public class basic{
// public static void main(String[] args){
//     dog d=new dog("Aaku");
//    // System.out.println(d.name);
//     d.eat();
//     d.bark();
    
//       }
// }



 /* multiple interface */
//  interface A{
//     void showA();
//  }
//  interface B{
//     void showB();
//  }
//  class  C implements A,B{
//     public void showA(){
//         System.out.println("A");

//     }
//       public void showB(){
//         System.out.println("B");

//     }

//  }
//  public class basic{
//     public static void main(String[] args){
//         C obj=new C();
//         obj.showA();
//         obj.showB();

//     }
//  }
/* Polymorphism */
/* overloading */
// 
// class Student{
//     int age;
//     int marks;
//     String name;
     
//     int mul(int marks){
//       return marks*2;
//     }
//     int add(int marks,int age){
//       return marks+age;
//     }
// }
// public class basic{
//    public static void main(String[] args){
//       Student res=new Student();
//       System.out.println(res.mul(20));
//       System.out.println(res.add(20,20));

//    }

// }
/*overriden*/
// class Teacher{
//     String name;
//     void study(){
//       System.out.println( name+"teach");
//    }
// } class Student extends Teacher{
//    void study(){
//       System.out.println(name+"study");
//       super.study();

//    }
// }
// public class basic{
//    public static void main(String args[]){
//       Teacher c=new Student();
//    c.name="aman";
//      c.study();
     
//    }
// }
/* abstract */
abstract class vehicle{
   abstract void start();
   // void eat(){
   //    System.out.println("Animal is eating");

   // }
}
class car extends vehicle{
   void start(){
      System.out.println("car is start my car is on in this time");
   }
}
public class basic{
   public static void main(String[] args){
      vehicle a=new car();
      a.start();
      //d.eat();
   }
}