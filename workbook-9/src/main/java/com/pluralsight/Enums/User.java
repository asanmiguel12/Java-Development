package com.pluralsight.Enums;

public class User {
    private UserRole userRole;
    private String userName;

    public User(UserRole userRole, String userName) {
        this.userRole = userRole;
        this.userName = userName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserRole printRole(UserRole userRole){
        return userRole;
    }
}
