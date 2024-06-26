package furniture;

public class Meja extends Mebel{
    protected int jmlKaki;

    public Meja(int harga, String bahan, int jmlKaki){
        super(harga, bahan);

        this.jmlKaki = jmlKaki;
    }

    public int getKaki(){
        return jmlKaki;
    }

    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
}