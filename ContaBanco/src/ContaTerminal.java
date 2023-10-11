import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.print("Informe o seu nome: ");
        nome_cliente=ler.next();

        System.out.print("Informe o número de sua conta: ");
        numero=ler.nextInt();

        System.out.print("Informe a sua agência: ");
        agencia=ler.next();

        System.out.print("Informe o seu saldo: ");
        saldo=ler.nextDouble();

        ler.close();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, " +
        "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
        " já está disponível para saque.");
       
    }
}
