
public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

       // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        // pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakrektor.beriSertifikatCumlaude(masterCumlaude);

        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masterCum);
    }
}
