import java.util.* ;

import java.awt.font.TextAttribute;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor() );
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow") ;
        System.out.println(p1.getColor() );


      //  BankAccount myAcc = new BankAccount();
      //  myAcc.username = "kartik jadon" ;
      //  myAcc.setPassword("sdfghjk");

     //   Student s1 = new Student ("KARTIK") ;
      //  System.out.println(s1.Name);
       // Student s1 = new Student () ;
        // Student s2 = new Student ("Kartik Thakur") ;
        // Student s3 = new Student (123) ;
          //s1.Name = "Kartik Jadon" ;
         //s1.roll  = 234 ;
        // s1.password = " abcd" ;

        // s1.marks[0] = 100;
        // s1.marks[1] = 90 ;
        // s1.marks[2] = 68 ;


        // Student s2 = new Student (s1) ;
        // s2.password = " xyx" ;
        // s1.marks [2] = 80;

        // for (int i =0 ;i< 3; i++) {
          //   System.out.println(s2.marks[i]);
         //}

        // Dog Sultan = new Dog() ;
        // Sultan.eat();
        //  Sultan.legs = 4;
       // System.out.println(Sultan.legs);

        // Fish shark = new Fish();
         //shark.eat();

        Human Kartik = new Human() ;
         Kartik.breathe();
         Kartik.walk();
         Kartik.Speak();

         Shark Poco = new Shark() ;
         Poco.eat();
         Poco.swim();
         Poco.Maneater();

        Parrot Mitthu =  new Parrot();
        Mitthu.breathe();
        Mitthu.Pet();
        Mitthu.fly();


    Calculator calc = new Calculator() ;
        System.out.println(calc.sum(2,4));
        System.out.println(calc.sum((float) 2.5 , (float) 2.5)) ;
        System.out.println(calc.sum(1,2,3));

        Deer d1 = new Deer() ;
            d1.eat();

        Horse h = new Horse();
        h.eat() ;
        h.walk();

      //  Chicken c = new Chicken();
        //c.eat();
        //c.walk();

        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eat();


        Student s1 = new Student() ;
        s1.SchoolName= "JMV";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        complex c = new complex(4,5);
        complex d = new complex(9,4);

        complex e = complex.Add (c,d);
        complex f = complex.diff(c,d);
        complex g = complex.product(c,d);

        e.printcomplex();
f.printcomplex();
g.printcomplex();



    }
}

class Pen {
   //  properties + function
   private String Color ;
    private int Tip ;

     String getColor() {
         return this.Color ;
     }

     int getTip() {
         return this.Tip ;
     }


    void setColor(String newColor) {
        Color = newColor ;
    }

    void setTip(int newTip) {
        Tip = newTip ;
    }
}

/*class Student {
    // properties + function

        String Name ;
    int roll;
    int marks[] ;
    String  password ;
    // copy construct
     //shallow copy constructer
   // Student (Student s1) {
     //   this.Name = s1.Name ;
       // this.roll = s1.roll ;
        //this.marks= s1.marks ;
      // }  */


    // deep copy constructer
   /* Student (Student s1) {
        marks = new int [3] ;
        this.Name = s1.Name ;
        this.roll = s1.roll ;
        for (int i= 0 ; i<3 ;i++)  {
            this.marks[i] = s1.marks[i] ;
        }
    }  */



    // non parameteried constructor
   /* Student() {
        marks = new int[3] ;
        System.out.println("constructor is called ");
    }

    // parameteried constructor

    Student(String name) {
        marks = new int [3] ;
        this.Name = name ;
    }

    Student (int roll) {

        marks = new int [3];
         this. roll = roll ;
    }

    void calcPercentage (int phy , int chem , int math) {
        int Percentage = (phy + chem + math) / 3;
    }

    void changeName(String newName) {
        Name = newName ;

    }
 }    */

    // Base class
    class Animal {
        Animal() {
            System.out.println("animal constructor is called");
        }
        String color;

        void eat() {
            System.out.println("eat everything");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    class Deer extends  Animal {
        Deer () {
            super.color = "brown";
            System.out.println("Deer constructor is called");

        }
    void eat() {
        System.out.println("eat grass");
    }
    }

    class Mammals extends Animal {
     //int legs ;
        void walk() {
            System.out.println("walks");
        }
    }

    class Human extends Mammals {
    void Speak() {
        System.out.println("Speak");
    }
    }


    class Fish extends Animal {
     // String breed ;
        void swim() {
            System.out.println("swim");
        }
    }

    class Shark extends Fish {
    void Maneater() {
        System.out.println("Maneater");
        }
    }

    class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
    }

    class Parrot extends Bird {
    void Pet() {
        System.out.println("Pet");
    }
    }

    class Calculator {

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c) {
        return a+b+c ;
    }

    float sum(float a , float b) {
        return a+b ;
        }
    }

    abstract class animalia {

    String color;

    animalia() {
        color = "Brown" ;
    }
       void eat() {

        System.out.println("animal eat");
       }

       abstract void walk() ;

    }


    class Horse extends animalia {
     void changecolor() {
         color = "dark brown " ;
     }
      void walk() {
          System.out.println("walk on four legs");
      }
    }

    class Chicken extends animalia {
      void walk() {
          System.out.println("walk on two legs");
      }
    }

    interface Herbivore {
           void eat() ;

    }



    interface Carnivores {
    void eat() ;

    }

    class Bear implements Herbivore,Carnivores {
      public   void eat () {
          System.out.println("eat both plant and meat");
      }
    }
    interface ChessPlayer{
      void moves() ;
    }

    class Queen implements ChessPlayer {
        public void moves() {
             System.out.println("up,down,left,right,diagonal (in all 4 direction)");
         }
    }

    class Rook implements ChessPlayer {
       public void moves() {
           System.out.println("up,down,left,right");
       }
    }

    class King implements ChessPlayer {
        public void moves() {
            System.out.println("up,down,left,right,diagonal(by one step)");
        }
    }

    //static keyword

    class Student {
    String Name  ;
    int Roll  ;

    static String SchoolName ;

    void setName(String name) {
        this.Name = name;
    }


    String getName() {
        return this.Name ;
    }
    }













    // Derived class
  /*  class Fish extends Animal  {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
    } */


   // Assignment Question
  class complex {

      int real ;
      int img ;

      public complex (int r, int i) {
          real = r;
          img = i ;
      }
      public static complex Add (complex a , complex b) {
          return  new complex((a.real  + b.real ), (a.img + b .img));
      }

      public static complex diff (complex a , complex b) {
         return new complex(( a.real - b.real ) , (a.img - b.img) ) ;
      }

      public static complex product (complex a , complex b) {
          return new complex((a.real * b.real), (a.img * b.img));
      }

      public void printcomplex() {
           if (real==0 & img != 0) {
               System.out.println(img + "i");
           } else if (img == 0 & real != 0) {
               System.out.println(real);
           } else {
               System.out.println(real + "+"+ img + "i");
           }
       }
   }









