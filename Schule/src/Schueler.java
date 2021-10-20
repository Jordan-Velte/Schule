public class Schueler {
    String _vorname;
    String _nachname;
    int _schulnummer;
    Schulklasse _schulklasse; 

    public Schueler(String vorname, String nachname, int schulnummer){
        setNachname(nachname);
        setVorname(vorname);
        setSchulnummer(schulnummer);
    }
    public Schueler(String vorname, String nachname, int schulnummer, Schulklasse schulklasse){
        setNachname(nachname);
        setVorname(vorname);
        setSchulnummer(schulnummer);
        setSchulklasse(schulklasse);
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setSchulnummer(int schulnummer) {
        this._schulnummer = schulnummer;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setSchulklasse(Schulklasse schulklasse) {
        this._schulklasse = schulklasse;
    }
    public String getNachname() {
        return _nachname;
    }
    public int getSchulnummer() {
        return _schulnummer;
    }
    public String getVorname() {
        return _vorname;
    }
    public Schulklasse getSchulklasse() {
        return _schulklasse;
    }

}
