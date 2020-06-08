/* Module 2. Task 1
 * Classname: Priamougolnik
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 * Create a class from the attached document according to the order in your group .  The class must contain

1. Constructor.
2.. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.
 */
package com.company;
import java.util.Objects;
//Class creation
public class Priamougolnik {
    private double sideA;
    private double sideB;

    //Constr. without parametrs
    public Priamougolnik() {
    }

    //Constr. with parametrs
    public Priamougolnik(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Getter 1
    public double getSideA() {
        return sideA;
    }

    //Setter 1
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    //Getter 2
    public double getSideB() {
        return sideB;
    }

    //Setter 2
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    //Method1 Area
    public double getArea() {
        return this.getSideA() * this.getSideB();
    }

    //Method2 Perimetr
    public double getLength() {
        return 2 * this.getSideA() + 2 * this.getSideB();
    }

    //Method3 Diagonal
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getSideA(), 2)
                + Math.pow(this.getSideB(), 2));
    }

    //Method4 Radius
    public double getBigRadius() {
        return Math.sqrt(Math.pow(this.getSideA(), 2)
                + Math.pow(this.getSideB(), 2)) / 2;
    }

    //Method5 Check for Square
    public boolean isSquare() {
        return (this.getSideA() == this.getSideB() ? true : false);
    }

    //To string method
    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", area=" + this.getArea() +
                ", length=" + this.getLength() +
                ", radius=" + this.getBigRadius() +
                ", diagonal=" + this.getDiagonal() +
                '}';
    }

    // Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Priamougolnik)) return false;
        Priamougolnik that = (Priamougolnik) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0;
    }

    //hashcode method
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }
}


