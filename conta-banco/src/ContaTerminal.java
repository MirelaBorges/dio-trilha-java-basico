import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome");
       String nome = scanner.next();

       System.out.println( "Digite seu sobrenome");
       String sobrenome = scanner.next();

       System.out.println("Digite número da agencia");
       int agencia = scanner.nextInt();
       
       System.out.println("Digite número da conta");
       int conta = scanner.nextInt();

       System.out.println("Digite seu saldo");
       double saldo = scanner.nextDouble();

       System.out.println("Ola " + nome + " " + sobrenome);
       System.out.println("obrigado por criar uma conta em nosso banco, sua agencia é " + agencia );
       System.out.println("conta" + conta );
       System.out.println("e seu saldo " + saldo + " já está disponível para saque");

    }
}
