class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0;
    public void setBankName(String name) {
        this.bankName = name;
    }
    public void setAmount(double amount) {
        if (amount >= 1000) {
            this.depositAmount = amount;
            totalAmount += amount;
        } else {
            System.out.println("Minimum deposit amount should be 1000: ");
        }
    }

    // Method to display bank name and deposit amount
    public void showData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
    }

    // Method to display the total amount deposited
    public static void displayTotalAmount() {
        System.out.println("Total Amount Deposited: " + totalAmount);
    }

    // Method to display the bank name with the minimum deposit amount
    public static void displayMinimumDepositBank(Bank[] banks) {
        double minAmount = Double.MAX_VALUE;
        String minBankName = "";

        for (Bank bank : banks) {
            if (bank.depositAmount < minAmount) {
                minAmount = bank.depositAmount;
                minBankName = bank.bankName;
            }
        }

        System.out.println("Bank with minimum deposit amount: " + minBankName);
    }
}

public class HA_Q3 {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];

        // Creating 5 bank objects and setting bank name and deposit amount
        for (int i = 0; i < banks.length; i++) {
            banks[i] = new Bank();
            banks[i].setBankName("Bank " + (i + 1));
            banks[i].setAmount(1500 + i * 500); // Deposit amount increases for each bank
        }

        // Displaying bank information
        for (Bank bank : banks) {
            bank.showData();
        }

        // Displaying total amount deposited
        Bank.displayTotalAmount();

        // Displaying the bank name with the minimum deposit amount
        Bank.displayMinimumDepositBank(banks);
    }
}