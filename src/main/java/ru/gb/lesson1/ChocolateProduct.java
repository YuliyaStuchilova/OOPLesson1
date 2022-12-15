package ru.gb.lesson1;

public class ChocolateProduct extends Product{
    private boolean hasNuts;

    public ChocolateProduct(int idProduct, String name, double cost, int number, boolean hasNuts) {
        super(idProduct, name, cost, number);
        this.hasNuts=hasNuts;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    @Override
    public String toString() {
        return "ChocolateProduct{" +
                "idProduct=" + super.getIdProduct() +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", number=" + super.getNumber() +
                ", hasNuts=" + this.hasNuts +
                '}';
    }
}
