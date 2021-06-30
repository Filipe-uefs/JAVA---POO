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
public class AppMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 999000;
        account.agencyNumber = 12345;
        account.nameBank = "Nubank";
        account.typeAccount = "P";
        account.nameUser = "Seu Madruga";
        account.makeDeposit(100);
        account.makeDeposit(150);
        account.takeMoney(200);
        account.makeDeposit(500);
        account.getInfo();
    }
    
}