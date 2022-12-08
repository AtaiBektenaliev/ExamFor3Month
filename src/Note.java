import java.time.LocalDate;

public class Note extends AbstractNote{
    private String header;

    public Note(String text, LocalDate data, TypeOfNote typeOfNote, String header) {
        super(text, data, typeOfNote);
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "Note{" +
                "header = '" + header + '\'' +
                " text = " + super.getText() +
                " data = " + super.getData() +
                " Type of note = " + super.getTypeOfNote() +
                '}' + "\n";
    }
}
