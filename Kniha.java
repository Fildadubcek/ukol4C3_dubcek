public class Kniha {
    private boolean vypujcena;
    private String nazev;
    private Autor autor;


public Kniha (String nazev, Autor autor) {
    if (nazev == null || nazev.isBlank() || autor == null) {
        throw new IllegalArgumentException("Název a autor nesmí být prázdné");
    }

    this.nazev = nazev;
    this.autor = autor;
}

public String getNazev() {
    return nazev;

}
public Autor getAutor() {
    return autor;

}

public boolean jeVypujcena() {
    return vypujcena;
}

public void setVypujcena(boolean vypujcena) {
    this.vypujcena = vypujcena;
}

@Override
public String toString() {
    return nazev + " " + autor;
}
}