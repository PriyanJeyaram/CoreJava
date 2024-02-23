package org.bootcamp.Day1.Bank;

abstract class Bank {
    protected static double rate;

    static {
        rate = 5.3;
    }

    protected String bankName;
    protected double principal;
    protected int n;

    public Bank(String bankName, double principal, int n) {
        this.bankName = bankName;
        this.principal = principal;
        this.n = n;
    }

    public abstract double getMaturityAmount();

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getRate() {
        return rate;
    }
}