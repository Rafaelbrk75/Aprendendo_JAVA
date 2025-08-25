package academy.devdojo.maratona.introducao;

import academy.devdojo.maratona.javacore.classes.Pessoa;

public class Aula02 {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int[] numeros = new int[]{1,2,3,4,5};

        for (int numero : numeros){
            System.out.println(numero);
        }

        int[][] dias = new int[2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;

        System.out.println("====================");
        for(int[] arrBase : dias){
            for(int dia : arrBase){
                System.out.println(dia);
            }
        }

        Pessoa rafael = new Pessoa();
        rafael.setNome("Rafael");
        rafael.setIdade(19);

       // rafael.printPessoa();
        System.out.println("Nome: " + rafael.getNome());
        System.out.println("Idade: " + rafael.getIdade());
        System.out.println("===================");
        rafael.printPessoa();
    }
}
