package company;

public class CEO extends Person {
     
     public CEO(String profession, String name, int age, String nationality, int salary) {
          this.profession = profession;
          this.name = name;
          this.age = age;
          this.nationality = nationality;
          this.salary = salary;
     }
     
     @Override
     public void work() {
          System.out.println("1. Inform the board of directors of the company's objectives, management and achievements.");
          System.out.println("2. Plan the necessary strategies to meet the objectives.");
          System.out.println("3. Motivate and advise the employees under your responsibility.");
          System.out.println("4. Make organizational decisions for a specific period.");
          System.out.println("5. Create the organizational structure of the corporation.");
          System.out.println("6. Set the objectives that will mark the direction of the entity.");
          System.out.println("7. Take care of clients.");
          System.out.println("");
     }
     
     @Override
     public void skills() {
          System.out.println("1. Strategic");
          System.out.println("2. Manage");
          System.out.println("3. Lead");
          System.out.println("4. To plan");
          System.out.println("5. High communication skills");
          System.out.println("6. Speak several languages(Spanish, English)");
          System.out.println("");
     }
}
