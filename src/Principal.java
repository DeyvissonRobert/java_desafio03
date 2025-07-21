import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double valor = 0;
        double saldo = 0;
        double fim = saldo - valor;

        System.out.println("Digite o limite do cartão: ");
        saldo = leitura.nextDouble();
        System.out.printf("Digite a descrição da compra: ");
        String nome = leitura.nextLine();
        System.out.println("Digite o valor da compra: ");
        valor += leitura.nextDouble();

        System.out.println("COMPRAS REALIZADAS:\n\n" + nome + " - " + valor + "\n \nSaldo do cartão: " + fim);



        System.out.println("\nCompra realizada! \nDigite 0 para sair ou 1 para continuar \n");
    }
}