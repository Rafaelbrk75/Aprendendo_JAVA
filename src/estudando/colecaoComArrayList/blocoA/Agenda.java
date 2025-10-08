package estudando.colecaoComArrayList.blocoA;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        boolean test = false;
        for (Contato num : contatos){
            if(num.getTelefone() == contato.getTelefone()) {
                test = true;
                break;
            }
        }
        if(test){
            System.out.println("Esse número já esta registrado");
        }else {
            this.contatos.add(contato);
        }
    }

    public void removerPorTelefone(int telefoneR) {
        for(Contato contato : this.contatos) {
            if(contato.getTelefone() == telefoneR) {
                this.contatos.remove(contato);
                return;
            }
        }
    }

    public void buscarPorNome() {

    }
}
