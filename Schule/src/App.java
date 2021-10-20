public class App {
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array){
            if (a ==null){
                array[i] = ele;
                break;
            }
            i = i+1;
        }
        System.out.println(i);
    }

    static Schueler[] _schueler;
    static Schulklasse[] _schulklasse;
    
    public static Schueler[] getALLSchueler(){
        return _schueler;
    }
    public static Schulklasse[] getALLSchulklasse(){
        return _schulklasse;
    }
    public static void addSchueler(Schueler schueler){
        addObject(schueler, getALLSchueler());
    }
    public static void addSchulklasse(Schulklasse schulklasse){
        addObject(schulklasse, getALLSchulklasse());
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Erster Test");
        _schueler = new Schueler[30];
        _schueler[0] = new Schueler("Jordan", "Velte", 22);
        _schueler[1] = new Schueler("Ferdinand", "Peters", 69);
        _schulklasse = new Schulklasse[10];
        _schulklasse[0] = new Schulklasse("11b");
        _schulklasse[1] = new Schulklasse("5c");

        //Menu
        Menu menu = new Menu();
        menu.startMenu();



        
    }
}
