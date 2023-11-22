//Abstract class

abstract class FinancialTransaction {

    private String transactionId;
    private double amount;

    public FinancialTransaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    // Abstract method to be implemented by subclasses
    public abstract void processTransaction();
}

// Inheritance
// A concrete class representing a bank transaction
// Inheriting from FinancialTransaction class above

class BankTransaction extends FinancialTransaction {

    private String accountNumber;

    public BankTransaction(String transactionId, double amount, String accountNumber) {
        // Super keyword
        // It is used to call superclass methods, and to access the superclass
        // constructor
        super(transactionId, amount);
        this.accountNumber = accountNumber;
    }

    // Overriding the abstract method from the superclass
    @Override

    public void processTransaction() {

        // Bank-specific transaction processing
        System.out.println("Bank transaction processed for the account: " + accountNumber);
    }
}

// Final class
// Final class representing a stock transaction
// Inheriting from FinancialTransaction
final class StockTransaction extends FinancialTransaction {

    private String stockSymbol;

    public StockTransaction(String transactionId, double amount, String stockSymbol) {
        super(transactionId, amount);
        this.stockSymbol = stockSymbol;
    }

    // Overriding the abstract method from the superclass
    @Override

    public void processTransaction() {

        // Stock-specific transaction processing
        System.out.println("Stock transaction processed for the stock: " + stockSymbol);
    }
}

// Driver code
public class FinancialTech {
    public static void main(String[] args) {

        // Bank transaction
        FinancialTransaction bankTransaction = new BankTransaction("A1024", 10000.0, "1234567890");
        bankTransaction.processTransaction();

        // Stock transaction
        FinancialTransaction stockTransaction = new StockTransaction("BSE1", 5000.0, "SGE");
        stockTransaction.processTransaction();
    }
}
