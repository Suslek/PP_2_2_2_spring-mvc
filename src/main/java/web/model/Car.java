package web.model;

import java.util.Objects;

public class Car {

    private int yearOfRelease;
    private int model;
    private String brand;

    public Car(int yearOfRelease, int model, String brand){
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.brand = brand;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfRelease=" + yearOfRelease +
                ", model=" + model +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYearOfRelease() == car.getYearOfRelease() && getModel() == car.getModel() && Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYearOfRelease(), getModel(), getBrand());
    }
}
