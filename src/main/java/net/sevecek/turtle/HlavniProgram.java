package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(500,380);


        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(350);
        zofka.turnRight(90);

        nakresliDomecek(zofka); //domeček vlevo dole

        zofka.penUp();
        zofka.turnLeft(150);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnRight(90);

        nakresliDomecek(zofka); //první domeček nahoře

        zofka.penUp();
        zofka.turnLeft(130);
        zofka.move(90);

        nakresliSlunicko(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(60);
        zofka.move(135);
        zofka.turnLeft(170);

        nakresliDomecek(zofka); //druhý domeček nahoře

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);

        nakresliDomecek(zofka); //třetí domeček nahoře

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);

        nakresliDomecek(zofka); //čtvrtý domeček nahoře

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);

        nakresliDomecek(zofka); //pátý domeček nahoře

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);

        nakresliDomecek(zofka); //domeček vpravo dole

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(230);

        /*nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);

        nakresliKolecko(zofka);*/

        zofka.turnRight(90);
        zofka.move(500);
        zofka.turnRight(90);

        napisH(zofka);

        napisE(zofka);

        napisL(zofka);

        napisE(zofka);

        napisN(zofka);

        napisA(zofka);

    }

    private void napisA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(15);
        zofka.move(82.5);
        zofka.turnRight(150);
        zofka.move(82.5);
        zofka.penUp();
        zofka.turnRight(105);
        zofka.move(40);
        zofka.turnRight(105);

        zofka.move(40);
        zofka.turnRight(75);
        zofka.penDown();
        zofka.move(13);
        zofka.penUp();
        zofka.turnRight(75);
        zofka.move(40);
        zofka.turnLeft(75);
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisN(Turtle zofka) {
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(150);
        zofka.move(92);
        zofka.turnLeft(150);
        zofka.move(80);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisL(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisE(Turtle zofka) {
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(35);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(35);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisH(Turtle zofka) {
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.move(80);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(75);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(75);
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
    }

    private void nakresliSlunicko(Turtle zofka) {
        nakresliKolecko(zofka);
        for (int j = 0; j < 12; j++) {
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(15);
            zofka.turnLeft(90);
            for (int i = 0; i < 3; i++) {
                zofka.move(5);
                zofka.turnRight(10);
            zofka.penDown();
            }
        }
    }

    private void nakresliKolecko(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 36; i++) {
            zofka.move(5);
            zofka.turnRight(10);
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
            zofka.move(75);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(75);

        zofka.turnLeft(30);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(25);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(60);

        zofka.move(100);
        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(25);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
    }
}
