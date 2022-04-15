package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.penDown();
        nakresliPrasatko(zofka);
    }

    private void nakresliPrasatko(Turtle zofka) {
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
