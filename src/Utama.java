public class Utama {
    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(9);
        Segitiga segitiga = new Segitiga(20, 10);
        Lingkaran lingkaran = new Lingkaran(14);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("=============================");
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("=============================");
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("=============================");
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}
