//used libraries
import Lista.List;
import Pilha.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //loop that keeps the user in the program
        while (true){

            //program options menu
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

                    //loop that keeps the user in the module
                    while (!options.equals("s")) {

                        //module options menu
                        System.out.println("Menu de opções:");
                        System.out.println("1. Adicionar");
                        System.out.println("2. Pesquisar");
                        System.out.println("3. Deletar");
                        System.out.println("4. Atualizar");
                        System.out.println("5. Mostrar");
                        System.out.println("Escolha uma opção:");

                        int options_list = scanner.nextInt();
                        scanner.nextLine();

                        switch (options_list){
                            //add
                            case 1:
                                //get data
                                System.out.println("Informe o dado:");
                                String data = scanner.nextLine();
                                list.addData(data);
                                break;

                            //search
                            case 2:
                                //get data
                                System.out.println("Informe o dado:");
                                String data_search = scanner.nextLine();
                                boolean result = list.search(data_search);
                                if(result){
                                    System.out.println("Dado encontrado");
                                }else {
                                    System.out.println("Dado não encontrado");
                                }
                                break;

                            //delete
                            case 3:
                                //get data
                                System.out.println("Informe o dado:");
                                String data_delete = scanner.nextLine();
                                int index = list.getIndexText(data_delete);
                                list.remove(index);
                                break;

                            //update
                            case 4:

                                break;

                            //print
                            case 5:
                                list.print();
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }

                        //ask if want to stay,if not,break the loop
                        System.out.println("Deseja sair deste módulo?[s/n]");
                        options = scanner.nextLine();

                    }
                    System.out.println("===================================================");

                    break;
                    //stack
                case 2:
                    System.out.println("====================Stack Module====================");
                    Stack stack = new Stack();
                    System.out.println("====================================================");
                    break;
                    //binary tree
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            //ask if want to stay,if not,break the loop
            System.out.println("Deseja fechar o programa?[s/n]");
            String option_loop = scanner.nextLine();

            if(option_loop.equals("s")){
                break;
            }

        }
    }
}
