import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber = sc.nextInt();
        String agency = sc.nextLine();
        String clientName = sc.nextLine();
        double balance = sc.nextDouble();


        System.out.println("Olá " + clientName +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agency + ", conta " + accountNumber + " e seu saldo " +  balance + " já está disponível para saque");
    }
}