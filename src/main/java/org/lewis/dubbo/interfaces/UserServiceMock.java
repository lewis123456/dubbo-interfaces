package org.lewis.dubbo.interfaces;

public class UserServiceMock implements UserService{
    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getUserPassword() {
        return null;
    }

    @Override
    public int getServerPort() {
        return 0;
    }
}
