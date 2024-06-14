package company;

public class Main {
    public static void main(String[] args) {
         
         Person ceo = new CEO("CEO", "Josepth", 35, "Spain", 250000);
         ceo.communicate();
         
         Person executiveDirector = new Director("Executive Director", "Nicolas", 32, "Argentina", 168000);
         executiveDirector.communicate();
         
         Person commercialDirector = new Director("Commercial Director", "Sebastian", 30, "England", 170000);
         commercialDirector.communicate();
         
         Person projectManager = new Director("Project Manager", "Andres", 23, "Colombia", 220000);
         projectManager.communicate();
    }
}
