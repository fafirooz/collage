package ir.fa.collage.model;

public class Lesson {
    public String name;
    private int termCount;
    private double price;


    public Lesson(String name, int termCount) {
        this.name = name;
        this.termCount = termCount;
    }

    public Lesson(String name, int termCount, double price) {
        this.name = name;
        this.termCount = termCount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
}
