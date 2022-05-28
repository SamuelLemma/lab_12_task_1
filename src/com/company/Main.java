package com.company;

public class Main {

    public static void main(String[] args) {
        ShapesEnum se = ShapesEnum.TRIANGLE;
        Run.RunCode(se);

    }
}
        enum ShapesEnum {
            SQUARE(4), RECTANGLE(4), CIRCLE(0), TRAPEZOID(4), RHOMBUS(4),
            TRIANGLE(3), OVAL(0), HEXAGON(6);

            int count;

            ShapesEnum(int count) {
                this.count = count;
            }
        }
  class Run {
    public static void RunCode(ShapesEnum se) {
        if (se.count >= 0) {
            System.out.println(String.format("%s has %s cornors.",
                    se.name(), se.count));
        } else {
            System.out.println("Sorry, we can't read that shape.");
        }

            }
        }


