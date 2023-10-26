package models;

public class ShorUser {
    private int age;
    private String name;

    public ShorUser(int age, String name) {
        setAge(age);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
