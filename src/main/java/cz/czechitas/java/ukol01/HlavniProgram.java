package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(230);

       zofka.turnLeft(20);
       zofka.penDown();

        slunecko(zofka);


    }

  private static void slunecko(Turtle zofka) {
    for (int i = 0; i < 12; i++) {
      zofka.move(3);
      zofka.turnRight(30);
      zofka.move(20);
    }
    for (int i = 0; i < 12; i++) {
      zofka.move(3);
      zofka.turnRight(30);
      zofka.move(20);
      zofka.turnLeft(90);
      zofka.penDown();
      zofka.move(40);

      zofka.turnRight(180);
      zofka.penUp();
      zofka.move(40);

      zofka.turnLeft(90);

    }

    zofka.turnRight(150);
    zofka.penUp();
    zofka.move(100);
    zofka.turnLeft(40);
    zofka.move(100);

    //domecek
    for (int i = 0; i < 5; i++) {
      domecek(zofka);
    }

    zofka.move(80);
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnRight(270);

    domecek(zofka);

    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(800);
    zofka.turnRight(180);

    domecek(zofka);

  }

  private static void domecek(Turtle zofka) {
    zofka.penDown();
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(70);
    zofka.turnLeft(35);
    zofka.move(35);
    zofka.turnLeft(110);
    zofka.move(35);
    zofka.turnLeft(125);
    zofka.move(40);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(70);
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(80);
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
