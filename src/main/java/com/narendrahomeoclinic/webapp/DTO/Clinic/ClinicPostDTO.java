package com.narendrahomeoclinic.webapp.DTO.Clinic;

public class ClinicPostDTO {

    private String name;

    private String category;

    private String beforeImagePath;

    private String afterImagePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBeforeImagePath() {
        return beforeImagePath;
    }

    public void setBeforeImagePath(String beforeImagePath) {
        this.beforeImagePath = beforeImagePath;
    }

    public String getAfterImagePath() {
        return afterImagePath;
    }

    public void setAfterImagePath(String afterImagePath) {
        this.afterImagePath = afterImagePath;
    }
}
