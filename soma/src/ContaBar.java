import java.util.Scanner;

public class ContaBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = sc.nextInt();

        double ingresso = (sexo == 'F') ? 8.00 : 10.00;

        double consumo = (qtdCervejas * 5.00) + (qtdRefrigerantes * 3.00) + (qtdEspetinhos * 7.00);

        double couvert = (consumo > 30.00) ? 0.00 : 4.00;

        double valorTotal = consumo + couvert + ingresso;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvert);
        System.out.printf("Ingresso = R$ %.2f\n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

        sc.close();
    }
}