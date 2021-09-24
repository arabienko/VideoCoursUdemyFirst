package homeWork.lesson5;

public class BankAccount {

    int id;
    double balance;

    double popolnenieScheta(double balanceIn) {
        balance += balanceIn;
        return balance;
    }

    double snyatieSoScheta(double balanceOut) {
        balance -= balanceOut;
        return balance;
    }
    
    void showInfoAccount(){
        System.out.println("id: "+id+" balanc: "+balance);
    }
}

class clientbank {

    public static void main(String[] args) {
        BankAccount clientbankOne = new BankAccount();
        BankAccount clientbankTwo = new BankAccount();
        
        clientbankOne.balance = 258.89;
        clientbankOne.id = 125;

        clientbankTwo.balance = 158.2;
        clientbankTwo.id = 12;

        clientbankOne.popolnenieScheta(15.8);
        clientbankTwo.snyatieSoScheta(4.5);
        
        clientbankOne.showInfoAccount();
        clientbankTwo.showInfoAccount();

    }
}
