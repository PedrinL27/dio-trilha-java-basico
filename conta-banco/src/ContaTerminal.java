import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Insira a agencia: ");
        String agencia = sc.nextLine();

        System.out.print("Insira o nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Insira o saldo: ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
