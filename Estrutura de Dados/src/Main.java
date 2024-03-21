
import Lista.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Escolha qual estrutura deseja utilizar : ");
            System.out.println("1. Lista");
            System.out.println("2. Pilha");
            System.out.println("3. Árvore Binária");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                //list
                case 1:
                    System.out.println("====================List Module====================");
                    //standard object of operations
                    List list = new List();
                    String options="";
                    while (!options.equals("s")) {
                        System.out.println("Deseja sair deste módulo?[s/n]");
                        options = scanner.nextLine();
                    }
                    System.out.println("===================================================");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Deseja fechar o programa?[s/n]");
            String option_loop = scanner.nextLine();
            if(option_loop.equals("s")){
                break;
            }
        }
    }
}
