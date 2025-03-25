public class Autor {
    private String jmeno;
    private String prijmeni;

    public Autor(String jmeno, String prijmeni) {
        if (jmeno == null || jmeno.isBlank() || prijmeni == null || prijmeni.isBlank()) {
            throw new IllegalArgumentException("Jméno a příjmení nesmí být prázdné");
        }

        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;

    }
}