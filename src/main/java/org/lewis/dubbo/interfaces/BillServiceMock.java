package org.lewis.dubbo.interfaces;

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
