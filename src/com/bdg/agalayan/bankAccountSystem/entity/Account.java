package com.bdg.agalayan.bankAccountSystem.entity;

import com.bdg.agalayan.bas.AccountBalance;

import java.time.LocalDate;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;



   public Account(Customer customer, CreditCard creditCard, AccountBalance balance) {

        this.customer=customer;
        this.creditCard = creditCard;
        this.accountBalance = balance;
    }


    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String toString(){
       return "Account[customer:"+customer+
               ", creditCard:"+creditCard+
               ", balance:"+accountBalance+"]";
    }






}