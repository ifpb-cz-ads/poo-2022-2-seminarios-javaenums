import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRoupa {
    public void addRoupa(Estoque estoque) {
        Scanner scanner = new Scanner(System.in);
        int resp1;
        do {
            System.out.println("\nQue tipo de roupa deseja adicionar" +
                    "\n0- Cancelar" +
                    "\n1- Camisa" +
                    "\n2- Vestido" +
                    "\n3- Chinelo");
            resp1 = scanner.nextInt();
            switch (resp1) {
                case 0: break;
                case 1: estoque.addItem(addCamisa()); break;
                case 2: estoque.addItem(addVestido()); break;
                case 3: estoque.addItem(addChinelo()); break;
                case 4:
                default: System.out.println("Opção inválida!");
            }
            System.out.println("Deseja adicionar mais uma peça (s/n)?");
            String resp2 = scanner.next();
            resp2 = scanner.nextLine();
            if (resp2.equalsIgnoreCase("s\n")) resp1 = -1;
        } while (resp1 != 0);
    }

    public Roupa addCamisa() {
        String nome = setNome();
        List<String> tamanhos = setTamanhos();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        String manga = "";
        boolean gola;

        Scanner scanner = new Scanner(System.in);
        int resp1;
        do {
            System.out.println("\nQual é o tamanho da manga?\n1- Longa\n2- Curta\n3- Sem manga");
            resp1 = scanner.nextInt();

            switch (resp1) {
                case 1: manga = "longa"; break;
                case 2: manga = "curta"; break;
                case 3: manga = "sem manga"; break;
                default: System.out.println("Opção inválida!");
            }
        } while (resp1 < 1 || resp1 > 3);

        System.out.print("\nPossui gola alta (s/n)? ");
        String resp2 = scanner.next();
        resp2 = scanner.nextLine();
        if (resp2.equalsIgnoreCase("s")) gola = true;
        else gola = false;

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Camisa(nome, tamanhos, estampa, corDaRoupa, precoMin, fator, manga, gola);
    }

    public Roupa addVestido() {
        String nome = setNome();
        List<String> tamanhos = setTamanhos();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        String tamanhoSaia = null;
        String manga = null;

        // Resto do método

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Vestido(nome, tamanhos, estampa, corDaRoupa, precoMin, fator, tamanhoSaia, manga);
    }

    public Roupa addChinelo() {
        String nome = setNome();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        String material = null;
        int tamMin = 0;
        int tamMax = 0;

        // Resto do método

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Chinelo(nome, estampa, corDaRoupa, precoMin, fator, material, tamMin, tamMax);
    }

    /** MÉTODOS GERAIS */

    private String setNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira o nome da peça: ");
        return scanner.nextLine();
    }

    private List<String> setTamanhos() {
        List<String> tamanhos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os tamanhos disponíveis (para encerrar digite '0'):");
        String resp;

        do {
            resp = scanner.nextLine();
            if (!resp.equals("0")) tamanhos.add(resp);
        } while (!resp.equals("0"));

        return tamanhos;
    }

    private CorDaRoupa setCor() {
        return null;
    }

    private boolean hasEstampa() {
        System.out.print("\nA peça possui estampa (s/n)? ");
        Scanner scanner = new Scanner(System.in);
        String resp = scanner.nextLine();
        return resp.equalsIgnoreCase("s");
    }

    private double setPrecoMin() {
        System.out.print("\nQual é o preço do menor tamnaho da peça? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double setFator() {
        System.out.print("\nO quanto o preço aumenta de acordo com o tamanho da peça (%)? ");
        Scanner scanner = new Scanner(System.in);
        double resp = scanner.nextDouble();
        if (resp > 1) return resp / 100;
        return resp;
    }

}