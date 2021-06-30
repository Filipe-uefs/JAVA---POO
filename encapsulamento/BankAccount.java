/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author lipe_
 */
public class BankAccount {
    private String nameBank;
    private int agencyNumber;
    private int accountNumber;
    private String nameUser;
    private String typeAccount;
    private float balance;
    
    String getNameBank(){
        return this.nameBank;
    }
    void setNameBank(String nameBank){
        this.nameBank = nameBank;
    }
    int getAgencyNumber(){
        return this.agencyNumber;
    }
    void setAgencyNumber(int agencyNumber){
        this.agencyNumber = agencyNumber;
    }
    int getAccountNumber(){
        return this.accountNumber;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    String getNameUser(){
        return this.nameUser;
    }
    void setNameUser(String nameUser){
        this.nameUser = nameUser;
    }
    String getTypeAccount(){
        return this.typeAccount;
    }
    void setTypeAccount(String typeAccount){
        this.typeAccount = typeAccount;
    }
    
    int takeMoney(int value){
        if (this.balance - value < 0){
            System.out.println("Saldo insuficiente para realizar saque nesta quantia");
            return -1;
        }
        this.balance = this.balance - value;
        System.out.println("Saque de R$ "  + value + " realizado. Saldo: R$ " + this.balance);
        return value;
    }
    float makeDeposit(float value){
        this.balance += value;
        System.out.println("Depósito de R$ " + value + "realizado. Saldo: R$ " + this.balance);
        return this.balance;
    }
    
    void getInfo(){
        System.out.println("Banco: " + nameBank + " | Agência: " + agencyNumber + " | Conta: " + accountNumber);
        System.out.println("Cliente: " + nameUser + " | Tipo da conta: " + typeAccount + " | Saldo: R$" + balance);
    }
}