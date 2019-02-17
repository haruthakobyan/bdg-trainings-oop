package bas;


public final class BankService {

    private Account[] accounts;

    public BankService(final int maxAccountSize) {
        this.accounts = new Account[maxAccountSize];
    }

    public Account create(String customerName, String customerSurname, Country country, String street, String phoneNumber, double initialBalance) {
        //Implement this functionality
        Address address = new Address(country, street, phoneNumber);
        Customer customer = new Customer(customerName, customerSurname, address);
        AccountBalance balance = new AccountBalance(initialBalance);
        Account account = new Account(customer, balance);

        return account;

    }

    public boolean transfer(final Account from, final Account to, final double amount) {
        //Implement this functionality
        from.deposit(amount);
        to.withdraw(amount);

        return false;
    }

    public Account[] findAllAccountWithBalanceRange(final double balanceFrom, final double balanceTo) {
        //Implement this functionality
        int lenght = 0;
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getAccountBalance().getBalance() >= balanceFrom && accounts[i].getAccountBalance().getBalance() <= balanceTo){
                lenght++;
            }
        }

        Account[] accountsByRange = new Account[lenght];
        int j=0;
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getAccountBalance().getBalance() >= balanceFrom && accounts[i].getAccountBalance().getBalance() <= balanceTo){
                accountsByRange[i] = accounts[i];
                j++;
            }
        }
        if(accountsByRange != null){
            return accountsByRange;
        }
        return null;
    }

    public Account findByCustomerName(final String customerName) {
        //Implement this functionality
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getCustomer().getCustomerName().contentEquals(customerName)){
                return accounts[i];
            }
        }

        return null;
    }

    public Account[] findAllAccountsByCountry(final Country country) {
        //Implement this functionality
        int lenght = 0;
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getCustomer().getAddress().getCountry().equals(country)){
                lenght++;
            }
        }
        Account[] accountsByCountry = new Account[lenght];
        int j=0;
        for (int i=0; i<accounts.length; i++){
            if(accounts[i].getCustomer().getAddress().getCountry().equals(country)){
                accountsByCountry[j] = accounts[i];
                j++;
            }
        }
        if(accountsByCountry != null){
            return  accountsByCountry;
        }

        return null;
    }
}