import java.time.LocalDate;

public class Contacts extends AbstractNote{
    private String phoneNum;
    private String contactName;
    private TypeOfNumber typeOfNumber;

    public Contacts(String text, LocalDate data, TypeOfNote typeOfNote, String phoneNum, String contactName,
                    TypeOfNumber typeOfNumber) {
        super(text, data, typeOfNote);
        this.phoneNum = phoneNum;
        this.contactName = contactName;
        this.typeOfNumber = typeOfNumber;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public TypeOfNumber getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(TypeOfNumber typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phoneNum='" + phoneNum + '\'' +
                ", contactName='" + contactName + '\'' +
                ", typeOfNumber=" + typeOfNumber +
                " text = " + super.getText() +
                " data = " + super.getData() +
                " type of note = " + super.getTypeOfNote() +
                '}';
    }
}
