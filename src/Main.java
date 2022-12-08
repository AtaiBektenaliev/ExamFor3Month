import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Note note1 = new Note("Java", LocalDate.now(), TypeOfNote.IDEAS, "Backend program");
        Note note2 = new Note("Должен", LocalDate.now(), TypeOfNote.DUTY, "денег");
        Note note3 = new Note("Python", LocalDate.now(), TypeOfNote.IDEAS, "Backend program");
        Note[] notes = {note1, note2, note3};

        Contacts contact1 = new Contacts("что то", LocalDate.now(), TypeOfNote.IDEAS, "07844877",
                "Sasha", TypeOfNumber.MOBilE);
        Contacts contact2 = new Contacts("Как дела?", LocalDate.now(), TypeOfNote.IDEAS, "05696484",
                "Pasha", TypeOfNumber.MOBilE);
        Contacts contact3 = new Contacts("Нужна помощь", LocalDate.now(), TypeOfNote.IDEAS, "104",
                "Sasha", TypeOfNumber.URBAN);
        Contacts[] contacts = {contact1, contact2, contact3};

        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt");
            fileWriter.write(note1.toString());
            fileWriter.write(note2.toString());
            fileWriter.write(note3.toString());

            fileWriter.write(contact1 + "\n");
            fileWriter.write(contact2 + "\n");
            fileWriter.write(contact3 + "\n");

            fileWriter.close();

            System.out.println("Программа была отработана успешно.");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
