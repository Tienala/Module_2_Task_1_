/* Module 2. Task 1
 * Classname: Main
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
public class Main {

    public static void main(String[] args) {
        Priamougolnik priamougolnik1 = new Priamougolnik(3,4);
        Priamougolnik priamougolnik2 = new Priamougolnik((10+5)/5, 4);
        System.out.println(priamougolnik1);
        System.out.println(priamougolnik1.hashCode());
        boolean equals = priamougolnik1.equals(priamougolnik2);
        System.out.println(equals);
    }
}