package bai3;
import java.time.LocalDate;
public class car {
    private String make;
    private String model;
    private int year;

    public car() {
    }

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < LocalDate.now().getYear())
            this.year = year;
        else {
            System.out.println("năm sản xuất không được lớn hơn năm hiện tại");
        }
    }

}
