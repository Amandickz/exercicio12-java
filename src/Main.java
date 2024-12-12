import classes.Account;
import exceptions.AccountExceptions;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer number;
        String holder;
        double initialBalance, withdrawalLimit, withdrawalAmount;

        try{
            System.out.println("Entre com as informações da conta:");
            System.out.print("Número: ");
            number = scan.nextInt();
            System.out.print("Cliente: ");
            scan.nextLine();
            holder = scan.nextLine();
            System.out.print("Saldo Inicial: ");
            initialBalance = scan.nextDouble();
            System.out.print("Limite de Saque da Conta: ");
            withdrawalLimit = scan.nextDouble();

            Account account = new Account(number, holder, withdrawalLimit);
            account.deposit(initialBalance);

            System.out.print("\nDigite o valor de saque: ");
            withdrawalAmount = scan.nextDouble();

            account.withdraw(withdrawalAmount);
            System.out.println(account.toString());
        }
        catch (AccountExceptions e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        scan.close();
    }
}