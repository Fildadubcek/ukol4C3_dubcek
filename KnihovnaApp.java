public class KnihovnaApp {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Karel", "Čapek");
        Kniha kniha1 = new Kniha("R.U.R.", autor1);
        Kniha kniha2 = new Kniha("Válka s Mloky", autor1);

        Ctenar ctenar1 = new Ctenar("Jan Novák");

        // Výpůjčka knih
        ctenar1.vypujcitKnihu(kniha1);
        ctenar1.vypujcitKnihu(kniha2);

        // Zobrazení vypůjčených knih
        ctenar1.vypsatSeznamKnih();

        // Pokus o výpůjčku již půjčené knihy
        Ctenar ctenar2 = new Ctenar("Marie Svobodová");
        ctenar2.vypujcitKnihu(kniha1); // Měla by vypsat, že kniha je už půjčená

        // Vrácení knihy
        ctenar1.vratitKnihu(kniha1);
        ctenar1.vypsatSeznamKnih();

        // Teď by si ji mohla půjčit Marie
        ctenar2.vypujcitKnihu(kniha1);

        ctenar2.vypsatSeznamKnih();

    }
}