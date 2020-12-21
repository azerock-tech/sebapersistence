package tum.seba.persistences.demo.entity;

import javax.persistence.Entity;

@Entity
public class Square extends Shape {
    private int length;

    public Square(String color, int length) {
        super(color);
        this.length = length;
    }

    public Square() {

    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
