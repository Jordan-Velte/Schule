public class Schulklasse {
    String _name;
    Schueler _schueler;
    int _maxTeilnehmer;

    public Schulklasse(String name, Schueler schueler){
        setName(name);
        setSchueler(schueler);
    }
    public Schulklasse(String name, int maxTeilnehmer){
        setName(name);
        setMaxTeilnehmer(maxTeilnehmer);
    }
    public void setMaxTeilnehmer(int maxTeilnehmer) {
        this._maxTeilnehmer = maxTeilnehmer;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setSchueler(Schueler schueler) {
        this._schueler = schueler;
    }
    public String getName() {
        return _name;
    }
    public Schueler getSchueler() {
        return _schueler;
    }
    public int getMaxTeilnehmer() {
        return _maxTeilnehmer;
    }

}
