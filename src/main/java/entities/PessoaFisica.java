package entities;

public class PessoaFisica extends Contribuinte{

    private double gastossaude;

    public PessoaFisica(){

    }

    public PessoaFisica(String nome, double renda, double gastossaude) {
        super(nome, renda);
        this.gastossaude = gastossaude;
    }

    public double getGastossaude() {
        return gastossaude;
    }

    public void setGastossaude(double gastossaude) {
        this.gastossaude = gastossaude;
    }

    @Override
    public double impostopago(){
        if (getRenda() < 20000){
            return getRenda() * 0.15;
        }else{
            return getRenda() * 0.25 - (gastossaude * 0.50);
        }
    }
}
