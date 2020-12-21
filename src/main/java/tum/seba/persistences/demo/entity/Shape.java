package tum.seba.persistences.demo.entity;

import javax.persistence.*;
import javax.persistence.InheritanceType;

@Entity//für mapped superclass müssen die unterclassen als eigene tables behandlet werden
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//sonst überlappen sich ids
    private int id;
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
