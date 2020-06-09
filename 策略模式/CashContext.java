package 策略模式;

public class CashContext {
    CashSuper	cashSuper;

    public CashContext(CashSuper cashSuper)
    {
        this.cashSuper = cashSuper;
    }

    public double acceptCash(double money)
    {
        return cashSuper.acceptCash(money);
    }
}

