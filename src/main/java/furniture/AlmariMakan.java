package furniture;

public class AlmariMakan extends Almari implements Discountable{
    private int jmlRoda;

    public AlmariMakan(int harga, String bahan, boolean roda, int jmlRoda){
        super(harga, bahan, roda);

        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda(){
        return jmlRoda;
    }

    public void setJmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }

    @Override
    public void discount(int harga){
        this.harga -= harga;
    }
}
