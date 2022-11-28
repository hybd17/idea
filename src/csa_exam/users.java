package csa_exam;

import java.io.Serializable;
import java.util.ArrayList;

public class users implements Serializable {
    private String usernameData;
    private String passwordData;
    private String studentIDData;
    private String genderData;

    public users() {
        super();
    }

    public users(String usernameData, String passwordData, String studentIDData, String genderData) {
        this.usernameData = usernameData;
        this.passwordData = passwordData;
        this.studentIDData = studentIDData;
        this.genderData = genderData;
    }

    public String getUsernameData() {
        return usernameData;
    }

    public void setUsernameData(String usernameData) {
        this.usernameData = usernameData;
    }

    public String getPasswordData() {
        return passwordData;
    }

    public void setPasswordData(String passwordData) {
        this.passwordData = passwordData;
    }

    public String getStudentIDData() {
        return studentIDData;
    }

    public void setStudentIDData(String studentIDData) {
        this.studentIDData = studentIDData;
    }

    public String getGenderData() {
        return genderData;
    }

    public void setGenderData(String genderData) {
        this.genderData = genderData;
    }
}
