import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends AbstractNote{
    private BigDecimal sumOfDuty;

    public Duty(String text, LocalDate data, TypeOfNote typeOfNote, BigDecimal sumOfDuty) {
        super(text, data, typeOfNote);
        this.sumOfDuty = sumOfDuty;
    }

    public BigDecimal getSumOfDuty() {
        return sumOfDuty;
    }

    public void setSumOfDuty(BigDecimal sumOfDuty) {
        this.sumOfDuty = sumOfDuty;
    }
}
