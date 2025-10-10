package POO.Ex03;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public void ocupar(Hospede hospede){
        if(this.ocupado){
            System.out.println("O quarto esta ocupado");
        } else{
            this.hospedeAtual = hospede;
            setOcupado(true);
        }
    }

    public void liberar(){
        this.hospedeAtual = null;
        setOcupado(false);
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Hospede getHospedeAtual() {
        return this.hospedeAtual;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public void setHospedeAtual(Hospede hospedeAtual) {
        this.hospedeAtual = hospedeAtual;
    }
}
