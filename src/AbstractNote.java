import java.time.LocalDate;

public abstract class AbstractNote implements WriteToFile{
    private String text;
    private LocalDate data = LocalDate.now();
    private TypeOfNote typeOfNote;

    public AbstractNote(String text, LocalDate data, TypeOfNote typeOfNote) {
        this.text = text;
        this.data = data;
        this.typeOfNote = typeOfNote;
    }

    public AbstractNote() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TypeOfNote getTypeOfNote() {
        return typeOfNote;
    }

    public void setTypeOfNote(TypeOfNote typeOfNote) {
        this.typeOfNote = typeOfNote;
    }

    @Override
    public void makeRecord() {

    }
}
