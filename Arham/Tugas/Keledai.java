public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai(String nama,int jmlKaki,String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    @Override
    public void displaymakan() {
        System.out.println("Makanan: Tumbuhan");
    }

    public void displayBinatang() {
        System.out.println("Jenis: Herbivora");
    }

    public void Data() {
        System.out.println("Nama: "+this.nama);
        System.out.println("Jumlah Kaki: "+this.jmlKaki);
        System.out.println("Suaranya: "+this.suara);
        System.out.println("Warna bulu: "+this.warnaBulu);
        System.out.println();
    }
}
