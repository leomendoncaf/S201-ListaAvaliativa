import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        tv tv = new tv();

        String canal;

        int param;


        System.out.println("Qual o modelo da sua TV: ");
        tv.nome = sc.nextLine();
        System.out.println("Qual canal desejado: ");
        tv.canal = sc.nextLine();
        System.out.println("1- Aumentar volume / 2 - Diminuir o volume / 3 - Mostrar informaçoes / 4 - Mudar canal / -1 para sair");
        param = sc.nextInt();
        while (param != -1) {
            switch (param) {
                case 1: {
                    System.out.println("Aumentar o volume em: ");
                    param = sc.nextInt();
                    tv.up(param);
                    break;
                }
                case 2: {
                    System.out.println("Diminuir o volume em: ");
                    param = sc.nextInt();
                    tv.down(param);
                    break;
                }
                case 3: {
                    tv.show();
                    break;
                }
                case 4: {
                    System.out.println("Qual o canal desejado: ");
                    canal = sc.next();
                    tv.trocaCanal(canal);
                }
            }
                    System.out.println("1- Aumentar volume / 2 - Diminuir o volume / 3 - Mostrar informaçoes / 4 - Mudar canal / -1 para sair");
                    param = sc.nextInt();

    }
    }
    }