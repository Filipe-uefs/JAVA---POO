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
public class AppMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(999000);
        account.setAgencyNumber(12345);
        account.setNameBank("Nubank");
        account.setTypeAccount("P");
        account.setNameUser("Seu Madruga");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Agency Number: " + account.getAgencyNumber());
        System.out.println("Name Bank: " + account.getNameBank());
        System.out.println("Type Account: " + account.getTypeAccount());
        System.out.println("Name user: " + account.getNameUser());
        account.makeDeposit(100);
        account.makeDeposit(150);
        account.takeMoney(200);
        account.makeDeposit(500);
        account.getInfo();
    }
    
}