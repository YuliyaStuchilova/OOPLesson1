package ru.gb.lesson1;

public class BootleProduct extends Product{
    private double volume;

    public BootleProduct(int idProduct, String name, double cost, int number, double volume) {
        super(idProduct, name, cost, number);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BootleProduct{" +
                "idProduct=" + super.getIdProduct() +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", number=" + super.getNumber() +
                ", volume=" + this.volume +
                '}';
    }
}
