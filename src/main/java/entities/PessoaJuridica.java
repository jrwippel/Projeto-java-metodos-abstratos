package entities;

public class PessoaJuridica extends Contribuinte{

    private int numeroFunc;

    public PessoaJuridica(){

    }

    public PessoaJuridica(String nome, double renda, int numeroFunc) {
        super(nome, renda);
        this.numeroFunc = numeroFunc;
    }

    public int getNumeroFunc() {
        return numeroFunc;
    }

    public void setNumeroFunc(int numeroFunc) {
        this.numeroFunc = numeroFunc;
    }

    @Override
    public double impostopago(){
        if(numeroFunc > 10){
            return getRenda() * 0.14;
        }else{
            return getRenda() * 0.16;
        }
    }
}
