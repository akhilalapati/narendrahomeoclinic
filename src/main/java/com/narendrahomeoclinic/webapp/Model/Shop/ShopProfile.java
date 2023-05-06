package com.narendrahomeoclinic.webapp.Model.Shop;

import java.time.LocalDate;

public class ShopProfile {

    private String userName;

    private String password;

    private String authPin;

    private LocalDate loginTime;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthPin() {
        return authPin;
    }

    public void setAuthPin(String authPin) {
        this.authPin = authPin;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDate loginTime) {
        this.loginTime = loginTime;
    }
}
