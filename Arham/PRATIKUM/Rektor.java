public class Rektor {
    
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda");

        mahasiswa.lulus();
        mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("---------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("---------------------------------------------");
    }
}