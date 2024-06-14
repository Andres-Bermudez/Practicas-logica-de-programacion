package company;

public class Director extends Person {
     
     public Director(String profession, String name, int age, String nationality, int salary) {
          this.profession = profession;
          this.name = name;
          this.age = age;
          this.nationality = nationality;
          this.salary = salary;
     }
     
     @Override
     public void work() {
          System.out.println("1. Set and meet objectives.");
          System.out.println("2. Ability to convey key concepts.");
          System.out.println("3. Motivate salespeople.");
          System.out.println("4. Establish a good relationship with your team.");
          System.out.println("5. Other functions");
          System.out.println("");
     }
     
     @Override
     public void skills() {
          System.out.println("1. Knowledge of applications for commercial management.");
          System.out.println("2. Design of business plans, marketing and sales strategies.");
          System.out.println("3. Budgeting, expense control and efficient resource management.");
          System.out.println("");
     }
}
