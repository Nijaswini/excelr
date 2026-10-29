package day6;

class EncapsulationBankAccounts {
    private String accountId;
    private String holderName;
    private double amount;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount must not be negative.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EncapsulationBankAccounts account =
                new EncapsulationBankAccounts();

        account.setAccountId("AC70931");
        account.setHolderName("nijaswini");
        account.setAmount(8200.50);

        System.out.println("Account ID: " + account.getAccountId());
        System.out.println("Holder Name: " + account.getHolderName());
        System.out.println("Account Balance: " + account.getAmount());
    }
}