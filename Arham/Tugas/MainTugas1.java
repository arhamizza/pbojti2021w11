public class MainTugas1 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("Gulali",4,"Haaum Hauum","Hitam Manis");
        Singa singa = new Singa("CingaCing",4,"Roaar Roaar","Coklat");
        Keledai keledai = new Keledai("Keledai",4,"Hehehehe","Abu-Abu");

        keledai.displayBinatang();
        keledai.displaymakan();
        keledai.Data();
        

        gorilla.displayBinatang();
        gorilla.displaymakan();
        gorilla.Data();

        singa.displayBinatang();
        singa.displaymakan();
        singa.Data();
    }
}
