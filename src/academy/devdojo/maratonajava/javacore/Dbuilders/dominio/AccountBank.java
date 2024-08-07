package academy.devdojo.maratonajava.javacore.Dbuilders.dominio;

public class AccountBank {

    private String owner;
    private int numberAccount;

    private double deposit;

    private double price;

    public AccountBank(String owner, int numberAccount, double deposit){
        this.owner = owner;
        this.numberAccount = numberAccount;
        this.deposit = deposit;
    }

    public AccountBank(String owner, int numberAccount, double deposit, double price) {
        this(owner, numberAccount, deposit);
        this.owner = owner;
        this.numberAccount = numberAccount;
        this.deposit = deposit;
        this.price = price;
        printer();
    }

    public void printer(){
        System.out.println(this.owner);
        System.out.println(this.numberAccount);
        System.out.println(this.deposit);
        System.out.println(this.price);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void deposite(double amount){
        if (amount > 0){
            deposit -= amount;
        }
    }

    public void withDrawe(double amount){
        if (amount > 0 && deposit >= amount){
            deposit -= amount;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

