package org.lewis.dubbo.interfaces;

public class AccountServiceMock implements AccountService{
    @Override
    public String accountRecharge() {
        return "error";
    }

    @Override
    public String accountRefund() {
        return "error";
    }

    @Override
    public String accountWithdraw() {
        return "error";
    }
}
