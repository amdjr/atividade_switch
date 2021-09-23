import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha a opção desejada:");
        System.out.println("[1-Taxa Natalidade] | [2-Taxa mortalidade]");
        byte taxa = teclado.nextByte();

        switch (taxa) {
            case 1:
                System.out.println("Digite o número de nascidos:");
                int nascidos = teclado.nextInt();
                System.out.println("Digite o número de habitantes:");
                int habitantes = teclado.nextInt();
                Calculos.calcularNatalidade(nascidos, habitantes);
                break;

            case 2:

                System.out.println("Digite o número de óbitos:");
                int obitos = teclado.nextInt();
                System.out.println("Digite o número de habitantes:");
                int habitante = teclado.nextInt();
                Calculos.calcularNatalidade(obitos, habitante);
                break;

            default:

                System.out.println("Dígito incorreto");
                break;

        }
        teclado.close();

    }

}
