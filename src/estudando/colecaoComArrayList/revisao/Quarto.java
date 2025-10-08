package estudando.colecaoComArrayList.revisao;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, double precoPorNoite, String tipo) {
        this.numero = numero;
        this.precoPorNoite = precoPorNoite;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public void ocupar (Hospede hospede) {
        this.hospedeAtual = hospede;
        this.ocupado = true;
    }

    public void liberar() {
        this.hospedeAtual = null;
        this.ocupado = false;
    }

    public Hospede getHospedeAtual() {
        return hospedeAtual;
    }

    public void setHospedeAtual(Hospede hospedeAtual) {
        this.hospedeAtual = hospedeAtual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
