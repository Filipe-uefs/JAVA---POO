/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduçãoPOO;

/**
 *
 * @author lipe_
 */
public class BankAccount {
    String nameBank;
    int agencyNumber;
    int accountNumber;
    String nameUser;
    String typeAccount;
    float balance;
    
    int takeMoney(int value){
        if (balance - value < 0){
            System.out.println("Saldo insuficiente para realizar saque nesta quantia");
            return -1;
        }
        balance = balance - value;
        System.out.println("Saque de R$ "  + value + " realizado. Saldo: R$ " + balance);
        return value;
    }
    float makeDeposit(float value){
        balance += value;
        System.out.println("Depósito de R$ " + value + "realizado. Saldo: R$ " + balance);
        return balance;
    }
    
    void getInfo(){
        System.out.println("Banco: " + nameBank + " | Agência: " + agencyNumber + " | Conta: " + accountNumber);
        System.out.println("Cliente: " + nameUser + " | Tipo da conta: " + typeAccount + " | Saldo: R$" + balance);
    }
}