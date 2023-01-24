package model;

public class Student {
    private String preName;
    private String name;
    private int previousPosition;
    private int newPosition;
    private String nationality;

    public Student(String preName, String name, int previousPosition, int newPosition, String nationality) {
        this.preName = preName;
        this.name = name;
        this.previousPosition = previousPosition;
        this.newPosition = newPosition;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        String fullName = this.preName + " " + this.name;
        return "Student " + fullName + " from " + nationality + " previously sat in seat " + previousPosition + " and now sits in seat " + newPosition;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreviousPosition() {
        return previousPosition;
    }

    public void setPreviousPosition(int previousPosition) {
        this.previousPosition = previousPosition;
    }

    public int getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(int newPosition) {
        this.newPosition = newPosition;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
