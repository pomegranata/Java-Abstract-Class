package furniture;

public class AlmariPakaian extends Almari implements Discountable{
    private int jmlPintu;

    public AlmariPakaian(int harga, String bahan, boolean roda, int jmlPintu){
        super(harga, bahan, roda);

        this.jmlPintu = jmlPintu;
    }

    public int getPintu(){
        return jmlPintu;
    }

    public void setPintu(int jmlPintu){
        this.jmlPintu = jmlPintu;
    }

    @Override
    public void discount(int harga){
        this.harga -= harga;
    }
}