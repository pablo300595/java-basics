package models;

public class User {
    private int age;
    private String name;
    private String gender;
    private String favoriteSport;

    public User(int age, String name, String gender, String favoriteSport) {
        setAge(age);
        setName(name);
        setGender(gender);
        setFavoriteSport(favoriteSport);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

}
