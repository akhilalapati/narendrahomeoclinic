package com.narendrahomeoclinic.webapp.DTO.Clinic;

public class ClinicProfileDTO {

    private String userName;

    private String password;

    private String authPin;

    private boolean occationFlag;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthPin() {
        return authPin;
    }

    public void setAuthPin(String authPin) {
        this.authPin = authPin;
    }

    public boolean isOccationFlag() {
        return occationFlag;
    }

    public void setOccationFlag(boolean occationFlag) {
        this.occationFlag = occationFlag;
    }
}
