class Account {
    private int accNo;
    private double balance;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }
    
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationEx {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccNo(123);
        a.setBalance(5000);

        System.out.println(a.getAccNo());
        System.out.println(a.getBalance());
    }
}
