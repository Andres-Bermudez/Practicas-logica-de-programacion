package company;

public abstract class Person {
     
     protected String profession;
     protected String name;
     protected int age;
     protected String nationality;
     protected int salary;
     
     public void communicate() {
          System.out.println(profession);
          System.out.println("Hello, I am " + profession);
          System.out.println("My name is " + name + "!");
          System.out.println("I am " + age + " years old");
          System.out.println("I am from " + nationality);
          System.out.println("------------------------------------");
          System.out.println("");
     }
     
     public void move() {
          System.out.println("This person is moving...");
          System.out.println("Walk...");
          System.out.println("Run...");
          System.out.println("Etc.");
          System.out.println("");
     }
     
     public void eat() {
          System.out.println("This person is eating!");
          System.out.println("Eating... uummm Delicious! :)");
          System.out.println("");
     }
     
     public void sleep() {
          System.out.println("This person is sleeping!");
          System.out.println("Sleeping...Zzzzz");
          System.out.println("-----------------------------------------------");
          System.out.println("");
     }
     
     public abstract void work();
     
     public abstract void skills();
}
