package ir.fa.collage.model;

public class Lesson {
    public Field name;
    private int termCount;
    private double price;


    public Lesson(Field name, int termCount) {
        this.name = name;
        this.termCount = termCount;
    }

    public Lesson (Field name, int termCount, double price) {
        this.name = name;
        this.termCount = termCount;
        this.price = price;
    }

    public Field getName() {
        return name;
    }

    public void setName(Field name) {
        this.name = name;
    }

    public int getTermCount() {
        return termCount;
    }

    public void setTermCount(int termCount) {
        this.termCount = termCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name=" + name +
                ", termCount=" + termCount +
                ", price=" + price +
                '}';
    }
}
