package classes;

import java.util.Objects;

public class CarDetails {
    private int year, price;
    private String color, model;

    public CarDetails(int year, int price, String color, String model) {
        this.year = year;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDetails that = (CarDetails) o;
        return year == that.year && price == that.price && Objects.equals(color, that.color) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, price, color, model);
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
