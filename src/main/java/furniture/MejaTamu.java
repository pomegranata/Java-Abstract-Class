package furniture;

public class MejaTamu extends Meja implements Discountable{
    private String bentukKaca;

    public MejaTamu(int harga, String bahan, int jmlKaki, String bentukKaca){
        super(harga, bahan, jmlKaki);

        this.bentukKaca = bentukKaca;
    }

    public String getKaca(){
        return bentukKaca;
    }

    public void setKaca(String bentukKaca){
        this.bentukKaca = bentukKaca;
    }

    @Override
    public void discount(int harga){
        this.harga -= harga;
    }
}


