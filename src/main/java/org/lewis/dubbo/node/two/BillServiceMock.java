package org.lewis.dubbo.node.two;

public class BillServiceMock implements BillService {
    @Override
    public boolean createBill() {
        return false;
    }

    @Override
    public boolean downloadBill() {
        return false;
    }
}
