package ex06;

public class Casa {
    private String endereco;
    private Comodo[] comodos;

    public Casa(Comodo[] comodos, String endereco) {
        this.comodos = comodos;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Comodo[] getComodos() {
        return comodos;
    }

    public void listarComodos() {
        System.out.printf("Comodos da casa em: %s:\n", endereco);
        for (Comodo c : comodos) {
            System.out.println(c);
        }
    }

}
