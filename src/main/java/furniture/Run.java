package furniture;

/**
 *
 * @author Imelda Maretta Putri
 * F11.2022.00053
 */

public class Run {

    public static void main(String[] args) {
        
        Mebel mebel = new Mebel(4000, "Jati");
        System.out.println("Harga Mebel: " + mebel.getHarga());
        System.out.println("Bahan Mebel: " + mebel.getBahan() + "\n");

        Meja meja = new Meja(17500, "Trembesi", 4);
        System.out.println("Harga Meja: " + meja.getHarga());
        System.out.println("Bahan Meja: " + meja.getBahan());
        System.out.println("Jumlah kaki Meja: " + meja.getKaki() + "\n");

        MejaMakan mMakan = new MejaMakan(4500, "Suar", 4, 4);
        System.out.println("Harga meja makan: " + mMakan.getHarga());
        System.out.println("Bahan meja makan: " + mMakan.getBahan());
        System.out.println("Jumlah kaki meja makan : " + mMakan.getKaki());
        System.out.println("Jumlah kursi meja makan : " + mMakan.getKursi() + "\n");

        MejaTamu mTamu = new MejaTamu(900, "Jati Belanda", 4, "Persegi Panjang");
        System.out.println("Harga meja tamu: " + mTamu.getHarga());
        System.out.println("Bahan meja tamu: " + mTamu.getBahan());
        System.out.println("Jumlah kaki meja tamu : " + mTamu.getKaki());
        System.out.println("Jumlah kursi meja tamu : " + mTamu.getKaca());
        mTamu.discount(150);
        System.out.println("Harga setelah diskon: " + mTamu.getHarga() + "\n");

        Almari almari = new Almari(500, "HPL", true);
        System.out.println("Harga almari: " + almari.getHarga());
        System.out.println("Bahan almari: " + almari.getBahan());
        System.out.println("Roda: " + almari.getRoda() + "\n");

        AlmariMakan aMakan = new AlmariMakan(2900, "Jaeger", false, 0);
        System.out.println("Harga almari makan: " + aMakan.getHarga());
        System.out.println("Bahan almari makan: " + aMakan.getBahan());
        System.out.println("Roda: " + aMakan.getRoda());
        System.out.println("Jumlah roda: " + aMakan.getJmlRoda());
        aMakan.discount(500);
        System.out.println("Harga setelah diskon:" + aMakan.getHarga() + "\n");

        AlmariPakaian aPakaian = new AlmariPakaian(82000, "Jati kombinasi Rotan", true, 2);
        System.out.println("Harga almari pakaian: " + aPakaian.getHarga());
        System.out.println("Bahan almari pakaian: " + aPakaian.getBahan());
        System.out.println("Roda: " + aPakaian.getRoda());
        System.out.println("Jumlah pintu: " + aPakaian.getPintu());
        aPakaian.discount(3000);
        System.out.println("Harga setelah diskon: " + aPakaian.getHarga() + "\n");
    }
}
