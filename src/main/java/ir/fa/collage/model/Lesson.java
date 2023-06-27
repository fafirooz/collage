package ir.fa.collage.model;

public class Lesson {
    public Field name;
    private int termCount;
    private double price;


    public Lesson(Field name, int termCount) { //overloading : استفاده ی متفاوت از متد داخل خود کلاس. باید پارامترهاش تغییر کنه یا تعدادش یا نوعش
        this.name = name;                   // overloading: هم برای متدها کاربرد داره هم کانستراکتور چون داخل خود کلاسه اما برای اوررایتینگ فقط متد انجام میشه
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
    public String toString() { //tostring: هر کلاسی به طور پیشفرض از کلاسی به اسم آبجکت ارث میبره و چون اینترفیس نیست میتونه اوراید هم نکنی به موردی برنمیخوره
        return "Lesson{" +
                "name=" + name +
                ", termCount=" + termCount +
                ", price=" + price +
                '}';
    }
}
