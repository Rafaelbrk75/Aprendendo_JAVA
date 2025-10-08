package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rafael", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Rafael", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Rafael", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Rafael", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
