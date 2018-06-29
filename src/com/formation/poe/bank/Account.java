//package com.formation.poe.bank;
//
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Account {
//
//    // Attributes
//
//    private int id = 0;
//    private Customer customer;
//    private double balance = 0;
//    private boolean isActive = true;
//    private boolean isBlocked = false;
//    private Date creationDate = new Date();
//    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
//
//    // public methods
//
//    double withdraw(double amount)
//    {
//        if (this.isActive && !this.isBlocked)
//        {
//            if (amount <= this.balance)
//            {
//                this.balance = this.balance - amount;
//                Transaction transaction = new Transaction(- amount);
//                getTransactionList().add(transaction);
//                return amount;
//            }
//            else {
//                return 0;
//            }
//        }
//        else{
//            return 0;
//        }
//    }
//
//    void deposit(double amount) {
//        this.setBalance(amount);
//        Transaction transaction = new Transaction(amount, fromAccount, toAccount);
//        getTransactionList().add(transaction);
//        }
//    }
//
//    void close() {
//        setActive(false);
//    }
//
//    void block(){
//        setBlocked(true);
//    }
//
//    void unblock(){
//        setBlocked(false);
//    }
//
//    // constructors
//
//    public Account(Customer customer){
//        this.setCustomer(customer);
//    }
//
//    public Account(){
//
//    }
//
//    // toString()
//
//    public String toString(){
//        return("(" + this.getId() + ", " + this.customer + ", " + this.balance +
//                ", this.active: " + this.isActive() + ", this.blocked: "
//                + this.isBlocked() + ", " + this.getCreationDate() + ")");
//    }
//
//
//    // (private) getters and setters
//
//    public int getId() {
//        return id;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public double getSolde() {
//        return balance;
//    }
//
//    private void setBalance(double amount) {
//        if (isActive() && !isBlocked())
//        {
//            this.balance += amount;
//        }
//    }
//
//    private boolean isActive() {
//        return isActive;
//    }
//
//    public boolean isBlocked() {
//        return isBlocked;
//    }
//
//    private Date getCreationDate() {
//        return creationDate;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setActive(boolean active) {
//        isActive = active;
//    }
//
//    private void setBlocked(boolean blocked) {
//        isBlocked = blocked;
//    }
//
//    private void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public ArrayList<Transaction> getTransactionList() {
//        return transactionList;
//    }
//}
