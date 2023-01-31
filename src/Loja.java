import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        System.out.println("\n=-----= BEM VINDO(A) =-----=");
        int resp;
        do {
            System.out.println("\n0- Sair\n1- Adicionar roupa\n2- Ver estoque");
            resp = scanner.nextInt();
            switch (resp) {
                case 0: break;
                case 1: new AddRoupa().addRoupa(estoque); break;
                case 2: estoque.verEstoque(); break;
                default: System.out.println("Opção inválida!");
            }
        } while (resp != 0);
        scanner.close();
    }

}
