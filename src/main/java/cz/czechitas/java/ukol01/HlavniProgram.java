package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu
        nakresliPrasatko(zofka);


    }

  private static void nakresliPrasatko(Turtle zofka) {
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(45);
    zofka.move(50);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(50);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnLeft(135);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(135);
    zofka.penDown();
    zofka.move(70);
    zofka.turnLeft(90);
    zofka.move(70);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(50);
  }

  public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
