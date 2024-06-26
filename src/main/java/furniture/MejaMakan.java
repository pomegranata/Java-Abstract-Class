package furniture;

public class MejaMakan extends Meja{
    private int jmlKursi;

    public MejaMakan(int harga, String bahan, int jmlKaki, int jmlKursi){
        super(harga, bahan, jmlKaki);

        this.jmlKursi = jmlKursi;
    }

    public int getKursi(){
        return jmlKursi;
    }

    public void setKursi(int jmlKursi){
        this.jmlKursi = jmlKursi;
    }
}
