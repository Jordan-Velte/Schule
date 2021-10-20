public class Schulklasse {
    String _name;
    Schueler[] _schueler;

    public Schulklasse(String name, Schueler[] schueler){
        setName(name);
        setSchueler(schueler);
    }
    public Schulklasse(String name){
        setName(name);
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setSchueler(Schueler[] schueler) {
        this._schueler = schueler;
    }
    public String getName() {
        return _name;
    }
    public Schueler[] getSchueler() {
        return _schueler;
    }

}
