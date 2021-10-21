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
    /*
    static String[] _schulergruppe1;
    static String[] _schulergruppe2;*/


    /*
    public static String[] getALLSchueler1(){
        return _schulergruppe1;
    }
    public static String[] getALLSchueler2(){
        return _schulergruppe2;
    }*/
    
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
        _schueler = new Schueler[30];
        _schulklasse = new Schulklasse[10];
        _schulklasse[0] = new Schulklasse("11b", 2);
        _schulklasse[1] = new Schulklasse("5c", 30);
        _schueler[0] = new Schueler("Jordan", "Velte", 22, _schulklasse[0]);
        _schueler[2] = new Schueler("Ferdinand", "Andersch", 70, _schulklasse[1]);

        //Menu
        Menu menu = new Menu();
        menu.startMenu();



        
    }
}
