package org.example;

public class DataPhone {
    private double price;
    private String color;


    public DataPhone(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public DataPhone() {
    }
// Getter Methods


    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    // Setter Methods

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DataPhone dataPhone = (DataPhone) obj;

        return  getPrice() == (dataPhone.getPrice()) &&
                getColor().equals(dataPhone.getColor());
    }

}
