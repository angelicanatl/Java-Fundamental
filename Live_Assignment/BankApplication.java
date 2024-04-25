// Angelica Natalie
// Live Assignment: Simple Banking Application

package Live_Assignment;

import java.util.Scanner;

class BankAccount {
    final private String account = "10305070";
    final private int pin = 654321;
    private double balance = 250000;
    private double credit = 75;

    public BankAccount() {
    }

    public boolean verify(String inputAccount, int inputPin) {
        if (this.account.equals(inputAccount) && this.pin == inputPin) {
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return this.credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}

class BankSystem {
    public BankSystem() {
    }

    public double withdraw(double balance, double withdrawal) {
        double remainingBalance = balance - withdrawal;
        if (remainingBalance < 50000) {
            return -1;
        } else {
            return remainingBalance;
        }
    }

    public double deposit(double balance, double deposit) {
        if (deposit < 0) {
            return -1;
        } else {
            return balance + deposit;
        }
    }

    public double convertCreditToCash(double credit, double converted) {
        if (converted < 0) {
            return -1;
        } else if (converted > credit) {
            return -2;
        } else {
            return converted * 1000;
        }
    }

    public double updateBalance(double balance, double convertedCredit) {
        return balance + convertedCredit;
    }

    public double updateCredit(double credit, double convertedCredit) {
        return credit - convertedCredit;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SIMPLE BANKING APP!!");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input account number:");
        String accountNumber = sc.next();
        System.out.println("Input PIN:");
        int accountPin = sc.nextInt();

        BankAccount ba = new BankAccount();
        if (ba.verify(accountNumber, accountPin)) {
            System.out.println("Verification Success!!");
            System.out.printf("Your account balance is: %.2f%n", ba.getBalance());
            System.out.printf("Your credit balance is: %.2f%n", ba.getCredit());
            System.out.println("A. Withdrawal\nB. Deposit\nC. Convert credit to cash");
            System.out.println("Choose banking service (A/B/C):");
            char opt = sc.next().charAt(0);

            BankSystem bs = new BankSystem();
            double amount;
            double result;
            if (opt == 'A') {
                System.out.println("Input withdrawal amount:");
                amount = sc.nextDouble(); // amount of withdrawal
                if (amount < 0) {
                    System.out.println("Invalid input");
                } else {
                    result = bs.withdraw(ba.getBalance(), amount);
                    if (result == -1) {
                        System.out.println("Withdrawal failed, insufficient balance");
                    } else {
                        ba.setBalance(result);
                        System.out.printf("Withdrawal succeed, your balance is %.2f", ba.getBalance());
                    }
                }
            } else if (opt == 'B') {
                System.out.println("Input deposit amount:");
                amount = sc.nextDouble(); // amount of deposit, nextDouble() already force user to input number in double data type if it's not will return input mismatch exception
                result = bs.deposit(ba.getBalance(), amount);
                if (result == -1) {
                    System.out.println("Invalid input");
                } else {
                    ba.setBalance(result);
                    System.out.printf("Deposit succeed, yout balance is %.2f", ba.getBalance());
                }
            } else if (opt == 'C') {
                System.out.println("Input credits you want to convert:");
                amount = sc.nextDouble(); // amount of credit to be converted
                result = bs.convertCreditToCash(ba.getCredit(), amount);
                if (result == -1) {
                    System.out.println("Invalid input");
                } else if (result == -2) {
                    System.out.println("Credit conversion failed, not enough credit");
                } else {
                    ba.setBalance(bs.updateBalance(ba.getBalance(), result));
                    ba.setCredit(bs.updateCredit(ba.getCredit(), amount));
                    System.out.println("Credit conversion succeed");
                    System.out.printf("Your balance is %.2f%n", ba.getBalance());
                    System.out.printf("Your credit is %.2f", ba.getCredit());
                }
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Verification Failed");
        }

        sc.close();
    }
}
