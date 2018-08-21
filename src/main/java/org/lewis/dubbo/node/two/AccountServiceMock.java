package org.lewis.dubbo.node.two;

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
