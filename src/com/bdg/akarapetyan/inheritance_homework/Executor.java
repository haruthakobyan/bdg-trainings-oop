package com.bdg.akarapetyan.inheritance_homework;

public class Executor {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        System.out.println(c.getArea());

        Student s = new Student("Arsen", "Yerevan", "Maths", 25, 1000);
        System.out.println(s.toString());

        Staff staff = new Staff("Arsen_employee", "Moscow", "Chekhov", 500.0);
        System.out.println(staff.toString());

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D.toString());

        MovablePoint mp = new MovablePoint(3,4, 5, 6);
        mp.move(mp);
        System.out.println(mp.toString());

        Shape shape = new Shape();
        System.out.println(shape.toString());

        Shape shape1 = new Shape("blue",false);
        System.out.println(shape1.toString());

        Circle_shape circle_shape = new Circle_shape();
        System.out.println(circle_shape.toString());

    }
}