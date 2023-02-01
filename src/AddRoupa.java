import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRoupa {
    public void addRoupa(Estoque estoque) {
        Scanner scanner = new Scanner(System.in);
        int resp1;
        do {
            System.out.println("\nQue tipo de roupa deseja adicionar?" +
                    "\n0- Cancelar" +
                    "\n1- Camisa" +
                    "\n2- Vestido" +
                    "\n3- Chinelo" +
                    "\n4- Bermuda" +
                    "\n5- Jaqueta");
            resp1 = scanner.nextInt();
            switch (resp1) {
                case 0: break;
                case 1: estoque.addItem(addCamisa()); break;
                case 2: estoque.addItem(addVestido()); break;
                case 3: estoque.addItem(addChinelo()); break;
                case 4: estoque.addItem(addBermudas()); break;
                case 5: estoque.addItem(addJaqueta()); break;
                default: System.out.println("Opcao invalida!");
            }
            System.out.println("Deseja adicionar mais uma peca (s/n)?");
            String resp2 = scanner.next();
            resp2 = scanner.nextLine();
            if (resp2.equalsIgnoreCase("s\n")) resp1 = -1;
            else resp1 = 0;
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
            System.out.println("\nQual eh o tamanho da manga?\n1- Longa\n2- Curta\n3- Sem manga");
            resp1 = scanner.nextInt();

            switch (resp1) {
                case 1: manga = "longa"; break;
                case 2: manga = "curta"; break;
                case 3: manga = "sem manga"; break;
                default: System.out.println("Opcao invalida!");
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInforme o tamanho da saia: ");
        tamanhoSaia = scanner.next();

        int resp1;
        do {
            System.out.println("\nQual eh o tamanho da manga?\n1- Longa\n2- Curta\n3- Sem manga");
            resp1 = scanner.nextInt();

            switch (resp1) {
                case 1: manga = "longa"; break;
                case 2: manga = "curta"; break;
                case 3: manga = "sem manga"; break;
                default: System.out.println("Opcao invalida!");
            }
        } while (resp1 < 1 || resp1 > 3);

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Vestido(nome, tamanhos, estampa, corDaRoupa, precoMin, fator, tamanhoSaia, manga);
    }

    public Roupa addChinelo() {
        Scanner scanner = new Scanner(System.in);

        String nome = setNome();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        String material;
        int tamMin = 0;
        int tamMax = 0;

        System.out.println("\nQual eh o material?");
        material = scanner.next();

        System.out.println("\nInforme o valor do tamanho minimo:");
        tamMin = scanner.nextInt();

        System.out.println("\nInforme o valor do tamanho maximo:");
        tamMax = scanner.nextInt();

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Chinelo(nome, estampa, corDaRoupa, precoMin, fator, material, tamMin, tamMax);
    }

    public Roupa addBermudas(){
        String nome = setNome();
        List<String> tamanhos = setTamanhos();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        Boolean bolso;
        String genero = "";
        // Resto do método

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPossui bolsos (s/n)? ");
        String resp1 = scanner.next();
        resp1 = scanner.nextLine();
        if (resp1.equalsIgnoreCase("s")) bolso = true;
        else bolso = false;

        int resp2;
        do {
            System.out.println("\nQual eh o genero da peca?\n1- Masculina\n2- Feminina\n3- Unissex");
            resp2 = scanner.nextInt();

            switch (resp2) {
                case 1: genero = "masculina"; break;
                case 2: genero = "feminina"; break;
                case 3: genero = "unissex"; break;
                default: System.out.println("Opcao invalida!");
            }
        } while (resp2 < 1 || resp2 > 3);

        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Bermudas(nome, tamanhos, estampa, corDaRoupa, precoMin, fator, bolso, genero);
    }

    public Roupa addJaqueta() {
        String nome = setNome();
        List<String> tamanhos = setTamanhos();
        CorDaRoupa corDaRoupa = setCor();
        Boolean estampa = hasEstampa();
        String manga = "";

        Scanner scanner = new Scanner(System.in);
        int resp;
        do {
            System.out.println("\nQual é o tamanho da manga?\n1- Longa\n2- Curta\n3- Sem manga");
            resp = scanner.nextInt();

            switch (resp) {
                case 1: manga = "longa"; break;
                case 2: manga = "curta"; break;
                case 3: manga = "sem manga"; break;
                default: System.out.println("Opção inválida!");
            }
        } while (resp < 1 || resp > 3);
        
        double precoMin = setPrecoMin();
        double fator = setFator();

        return new Jaqueta(nome, tamanhos, estampa, corDaRoupa, manga, precoMin, fator);
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
        System.out.println("Insira os tamanhos disponíveis, do menor para o maior (para encerrar digite '0'):");
        String resp;

        do {
            resp = scanner.nextLine();
            if (!resp.equals("0")) tamanhos.add(resp);
        } while (!resp.equals("0"));

        return tamanhos;
    }

    private CorDaRoupa setCor() {
        CorDaRoupa corDaRoupa = null;
        int resp;
        do {
            System.out.println("Qual a cor da peca?");
            for (CorDaRoupa cor : CorDaRoupa.values()) {
                System.out.printf("%d- %s%n", cor.ordinal() + 1, cor.name().toLowerCase());
            }
            Scanner scanner = new Scanner(System.in);
            resp = scanner.nextInt();

            switch (resp) {
                case 1: corDaRoupa = CorDaRoupa.PRETO; break;
                case 2: corDaRoupa = CorDaRoupa.CINZA; break;
                case 3: corDaRoupa = CorDaRoupa.BRANCO; break;
                case 4: corDaRoupa = CorDaRoupa.VERDE; break;
                case 5: corDaRoupa = CorDaRoupa.VERMELHO; break;
                case 6: corDaRoupa = CorDaRoupa.AZUL; break;
                case 7: corDaRoupa = CorDaRoupa.ROSA; break;
                case 8: corDaRoupa = CorDaRoupa.AMARELO; break;
                default: System.out.println("Opcao invalida!");
            }
        } while (resp < 1 || resp > CorDaRoupa.values().length);

        return corDaRoupa;
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
        double resp = scanner.nextDouble();
        return resp;
    }

    private double setFator() {
        System.out.print("\nO quanto o preço aumenta de acordo com o tamanho da peça (%)? ");
        Scanner scanner = new Scanner(System.in);
        double resp = scanner.nextDouble();
        if (resp > 1) return resp / 100;
        return resp;
    }

}
