package org.bootcamp.Day1.Bank;

public class AxisBank extends Bank{

    protected String bankName;
    protected static double rate;

    public AxisBank(String bankName, double principal, int n) {
        super(bankName, principal, n);
    }

    static {
        rate = 7.45;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        AxisBank.rate = rate;
    }

    @Override
    public double getMaturityAmount() {
        return principal * Math.pow((1 + rate / 100), n);
    }
}
