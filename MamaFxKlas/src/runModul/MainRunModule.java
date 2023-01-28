package runModul;

import model.ClassInformation;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRunModule {
    public void intro(){
        Student student = new Student();
        ClassInformation classRoom = new ClassInformation();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<>();

        int givenNumber = 10;

        System.out.println("Welkom bij studenten seperator!");

        do {
            System.out.println("\nIndien u studenten wil toevoegen aan het studentenbestand gelieve 0 in te geven");
            System.out.println("Als u wenst een overzicht te krijgen van alle studenten en gegevens gelieve 1 in te geven");
            System.out.println("Als u wenst de applicatie te gebruiken en nieuwe klasplaatsen toe te wijzen gelieve 2 in te geven");
            System.out.println("Als u het aantal klassen nog niet hebt aangegeven gelieve dit nu te doen door op 3 te drukken");
            System.out.println("Als u wenst een overzicht te krijgen van uw klaslokaal gelieve 4 in te geven\n");
            givenNumber = scanner.nextInt();

            if (givenNumber == 0){
                studentsList.add(student.studentAdd());
                givenNumber = 10;
            }
            if (givenNumber == 1){
                for (int i = 0; i < studentsList.size(); i++) {
                    System.out.println(studentsList.get(i).toString());
                }
            }
            if (givenNumber == 2){
                studentsList = student.toewijzenKlasplaats(studentsList);
            }
            if (givenNumber == 3){
                classRoom.setTotalPlaces(scanner.nextInt());
            }
        }
        while (givenNumber != 5);

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).toString());
        }
    }
}
