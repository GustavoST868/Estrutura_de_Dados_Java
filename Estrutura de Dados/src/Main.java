import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Escolha qual estrutura deseja usar : ");
            System.out.println("1. Lista");
            System.out.println("2. Pilha");
            System.out.println("3. Árvore Binária");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
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
