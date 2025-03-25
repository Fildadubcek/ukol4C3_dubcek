import java.util.ArrayList;
import java.util.List;

public class Ctenar {
    private String jmeno;
    private List<Kniha> vypujceneKnihy;

    public Ctenar(String jmeno) {
        if (jmeno == null || jmeno.isBlank()) {
            throw new IllegalArgumentException("Jméno nesmí být prázdné");
        }

        this.jmeno = jmeno;
        this.vypujceneKnihy = new ArrayList<>();
    }

    public String getJmeno() {
        return jmeno;
    }

    public List<Kniha> getVypujceneKnihy() {
        return vypujceneKnihy;
    }

    public boolean vypujcitKnihu(Kniha kniha) {
        if (kniha.jeVypujcena()) {
            System.out.println("Kniha " + kniha.getNazev() + "je již vypůjčená");
            return false;
        }
        kniha.setVypujcena(true);
        vypujceneKnihy.add(kniha);
        System.out.println(jmeno + " si vypůjčil knihu: " + kniha.getNazev());
        return true;
    }

    public boolean vratitKnihu(Kniha kniha) {
        if (!vypujceneKnihy.contains(kniha)) {
            System.out.println(jmeno + " nemá vypůjčenou knihu" + kniha.getNazev());
            return false;
        }
        kniha.setVypujcena(false);
        vypujceneKnihy.remove(kniha);
        System.out.println(jmeno + " vrátil knihu " + kniha.getNazev());
        return true;
    }

    public void vypsatSeznamKnih() {
        System.out.println("Čtenář " + jmeno + " má vypůjčené tyto knihy:");
        for (Kniha kniha : vypujceneKnihy) {
            System.out.println("-" + kniha.getNazev());
        }
    }
}