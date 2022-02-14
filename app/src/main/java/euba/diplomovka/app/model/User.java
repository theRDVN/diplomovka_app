package euba.diplomovka.app.model;

public class User {

    private String username;
    private String name;
    private String surname;
    private String userId;

    public User() {

    }

    public User(String username, String name, String surname, String userId) {

        this.username = username;
        this.name = name;
        this.surname = surname;
        this.userId = userId;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }
}