package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public String model;
    public int number;
    public int price;

    public Car() {
    }

    public Car(String model, int number, int price) {
        this.model = model;
        this.number = number;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
