package ir.fa.collage.model;

public class Lesson {
    private String name;
    private int termCount;
    private double price;
    private Teacher teacher;

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
