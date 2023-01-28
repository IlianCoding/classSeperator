package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private String preName;
    private String name;
    private int previousPosition;
    private int newPosition;
    private String nationality;

    public Student() {
        this.newPosition = 999;
    }

    //TODO aanmaken van het de randomAllocatieFunctie
    public ArrayList<Student> toewijzenKlasplaats(ArrayList<Student> studentList){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int toegewezenNummer = random.nextInt();
        int aangevenLijstInvullen = 0;

        while (aangevenLijstInvullen == 0){

            System.out.println("\nHieronder kan u alle studenten zien en hun toegewezen klasplaatsen." +
                    "Als u het hier niet mee akkoord bent kan u door op 0 te drukken opnieuw indelen." +
                    "Bent u tevreden, dan kan u op 1 drukken voor de lijst op te slagen.");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i).toString());
            }
            aangevenLijstInvullen = scanner.nextInt();
        }
        return studentList;
    }

    public Student studentAdd(){
        Scanner scanner = new Scanner(System.in);
        int fillInList = 0;
        do
        {
            Student student = new Student();
            System.out.println("Gelieve eerst de voornaam van de student mee te geven: ");
            student.setPreName(scanner.nextLine());
            System.out.println("Gelieve vervolgens de achternaam van de student mee te geven: ");
            student.setName(scanner.nextLine());
            System.out.println("Ten laatste gelieve de nationaliteit van de student mee te geven: ");
            student.setNationality(scanner.nextLine());
            fillInList = 1;
            return student;

        }while(fillInList ==0);
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
