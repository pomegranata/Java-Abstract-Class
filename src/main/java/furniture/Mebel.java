package furniture;

public class Mebel {
    protected int harga;
    protected String bahan;

    public Mebel(int harga, String bahan){
        this.harga = harga;
        this.bahan = bahan;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public String getBahan(){
        return bahan;
    }

    public void setBahan(String bahan){
        this.bahan = bahan;
    }
}
