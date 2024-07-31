package main;

import implementention.superMercado;
import implementention.superMercadoArray;

import java.util.Scanner;

public class caixa {

    private final static int SIZE = 3;

    public static void main(String[] args) {
        superMercado supermercado = new superMercadoArray(SIZE);
        Scanner conferir = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\nLista de compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Essolha uma opção: ");
            opcao = conferir.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite a compra desejada: ");
                    String item = conferir.next(); //apenas palavras simples
                    supermercado.add(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido");
                    int index = conferir.nextInt();
                    supermercado.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa. . .");
                    break;
                default:
                    System.out.println("Opção inválida. por favor, escolha novamente. ");

            }
        }while (opcao !=4 );
                    conferir.close();


    }
}
