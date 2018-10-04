
import java.time.LocalDate;
import java.time.LocalTime;


public class Measurement {
    private LocalDate date;
    private LocalTime time;
    private String plate;
    private int velMeasured;
    private int velAllowed;

    public Measurement(LocalDate date, LocalTime time, String plate, int velMeasured, int velAllowed) {
        this.date = date;
        this.time = time;
        this.plate = plate;
        this.velMeasured = velMeasured;
        this.velAllowed = velAllowed;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getPlate() {
        return plate;
    }

    public int getVelMeasured() {
        return velMeasured;
    }

    public int getVelAllowed() {
        return velAllowed;
    }
}
