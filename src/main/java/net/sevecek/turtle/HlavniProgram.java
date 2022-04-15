package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(600,400);

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(500);

        nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);

        nakresliKolecko(zofka);

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(250);

        nakresliSlunicko(zofka);
    }

    private void nakresliSlunicko(Turtle zofka) {
        nakresliKolecko(zofka);
        for (int j = 0; j < 12; j++) {
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
            for (int i = 0; i < 6; i++) {
                zofka.move(5);
                zofka.turnRight(5);
            zofka.penDown();
            }
        }
    }

    private void nakresliKolecko(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 72; i++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }

  private void nakresliPrasatko(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(200);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(150);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(150);

        zofka.turnLeft(30);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(60);

        zofka.move(200);
        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
    }
}
