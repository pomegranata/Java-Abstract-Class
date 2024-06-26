package furniture;

public class Almari extends Mebel{
    protected boolean roda;

    public Almari(int harga, String bahan, boolean roda){
        super(harga, bahan);

        this.roda = roda;
    }

    public boolean getRoda(){
        return roda;
    }

    public void setRoda(boolean roda){
        this.roda = roda;
    }

    
}