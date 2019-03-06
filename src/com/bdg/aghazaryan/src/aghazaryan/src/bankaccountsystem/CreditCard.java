package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.enums.CardType;
import com.bdg.aghazaryan.src.aghazaryan.src.classexercises.Date;
import java.util.Random;

public class CreditCard {

    private String cardNumber = "123456789";
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;


    public CreditCard (String cardNumber, int accountNumber, Date expirationDate, CardType cardType ){
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }


    public String setCardNumber;

    Random random = new Random();

    int CardNumber = random.nextInt(99);


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {

        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public Date getExpirationDate() {

        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {

        return cardType;
    }

    public void setCardType(CardType cardType) {

        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expirationDate=" + expirationDate +
                ", cardType=" + cardType +
                '}';
    }
}