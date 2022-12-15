package ru.gb.lesson1;

public class HotDrinkProduct extends Product {
    private double volume;
    private int temp;

    public HotDrinkProduct(int idProduct, String name, double cost, int number, double volume, int temp) {
        super(idProduct, name, cost, number);
        this.volume = volume;
        this.temp = temp;
    }

    public double getVolume() {
        return volume;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "HotDrinkProduct{" +
                "idProduct=" + super.getIdProduct() +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", number=" + super.getNumber() +
                ", volume=" + volume +
                ", temp=" + temp +
                '}';
    }
    
}
