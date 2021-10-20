import java.util.Scanner;


public class Menu {
    
    Scanner _scanner;
    public Menu(){
        this.setScanner(new Scanner(System.in));
    }
    public Scanner getScanner() {
        return _scanner;
    }
    public void setScanner(Scanner scanner) {
        this._scanner = scanner;
    }

    public void startMenu(){
        System.out.println("Wilkommen im Menu!");
        System.out.println("Möchten Sie die Anwendung starten?(j/n)");
        String choice = getScanner().nextLine();
        if(choice.equals("j")){
            System.out.println("Deine Auswahl ist: JA");
            System.out.println("(1) Schueler erstellen");
            System.out.println("(2) Schulklasse erstellen");
            System.out.println("(3) Schueler zeigen");
            System.out.println("(4) Schulklassen zeigen");
            String choice_j = getScanner().nextLine();
            System.out.println("Deine Auswahl ist: " + choice_j);
            if(choice_j.equals("1")){
                createSchueler();
            }
            else if(choice_j.equals("2")){
                createSchulklasse();
            }
            else if(choice_j.equals("3")){
                showSchueler();
            }
            else if(choice_j.equals("4")){
                showSchulklasse();
            }
            else{
                System.out.println("Bitte tätigen Sie eine gültige Eingabe.");
            }

        }
        else if(choice.equals("n")){
            System.out.println("Deine Auswahl ist: NEIN");
            System.out.println("Die Anwendung wird nicht gestartet.");
        }
        else{
            System.out.println("Bitte geben Sie nur j oder n ein.");
        }
        startMenu();
    }
    public void createSchueler(){
        System.out.println("Schueler erstellen. ");
        System.out.println("Vorname: ");
        String schuelervorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String schuelernachname = getScanner().nextLine();
        System.out.println("Schulnummer: ");
        String stringschuelerschulnummer = getScanner().nextLine();
        int schuelerschulnummer = Integer.valueOf(stringschuelerschulnummer);
        System.out.println("Schulklasse: ");
        int i = 0;
        for (Schulklasse schulklasse : App.getALLSchulklasse()){
            if (schulklasse!=null){
                System.out.println(i + " - " + schulklasse.getName());
                i++;
            }
        }
        String schulklasse_choice = getScanner().nextLine();
        int schulklassen_index = Integer.valueOf(schulklasse_choice);
        App.addSchueler(new Schueler(schuelervorname, schuelernachname, schuelerschulnummer, App.getALLSchulklasse()[schulklassen_index]));
        System.out.println("Es wurde ein neuer Schueler eingetragen.");
    }

    public void createSchulklasse(){
        System.out.println("Schulklasse erstellen. ");
        System.out.println("Name: ");
        String schulklassenname = getScanner().nextLine();
        App.addSchulklasse(new Schulklasse(schulklassenname));
        System.out.println("Es wurde eine neue Schulklasse eingetragen.");
    }

    public void showSchueler(){
        for (Schueler schueler: App.getALLSchueler()){
            if (schueler != null){
                System.out.println(schueler.getVorname() + " " + schueler.getNachname() + " " + schueler.getSchulnummer());
            }
        }
    }
    public void showSchulklasse(){
        System.out.println("Wählen Sie eine Klasse aus:");
        int i = 0;
        for (Schulklasse schulklasse: App.getALLSchulklasse()){
            if (schulklasse != null){
                System.out.println(i + " - " + schulklasse.getName());
                i++;
            }
        }
        String schulklasse_choice = getScanner().nextLine();
        int schulklasse_index = Integer.valueOf(schulklasse_choice);
        System.out.println(App.getALLSchulklasse()[schulklasse_index].getSchueler().getVorname() + " " + App.getALLSchulklasse()[schulklasse_index].getSchueler().getNachname());
        /*
        //Problem
        for (Schulklasse schulklasse: App.getALLSchulklasse()[schulklasse_index]){
            if (schulklasse != null){
                System.out.println(i + " - " + schulklasse.getSchueler().getVorname() + " " + schulklasse.getSchueler().getNachname() + " " + schulklasse.getSchueler().getSchulnummer());
                i++;
            }
        }*/
    }

}