package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        double stranaC;
        stranaC = vypocitejDelkuTretiStrany(100.0, 90.0);
        System.out.println("Strana A je 100.0, strana B je 100.0, uhel mezi nimi je 90.0°.");
        System.out.println("Pak je strana C dlouha " + stranaC);


        Turtle zofka;
        zofka = new Turtle();

        // SNEHULAK
        zofka.setLocation(50, 350);
        nakresliKolecko2(zofka, 80);
        zofka.penUp();
        nakresliCtvrtKolecka(zofka, 80);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliKolecko2(zofka, 55);
        zofka.penUp();
        nakresliCtvrtKolecka(zofka, 55);
        zofka.penDown();
        zofka.turnLeft(180);
        nakresliKolecko2(zofka, 15);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko2(zofka, 15);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(110);
        zofka.turnRight(90);
        nakresliCtvrtKolecka(zofka, 55);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKolecko2(zofka, 30);
        zofka.turnRight(90);

        // ZMRZLINA

        zofka.setLocation(250, 100);
        nakresliKolecko2(zofka, 80);
        zofka.penUp();
        nakresliKornout(zofka, 80);
        zofka.penDown();
        zofka.turnRight(105);
        nakresliTrojuhelnikA(zofka);
        zofka.turnRight(20);

        // LOKOMOTIVA

          zofka.setLocation(650, 350);
          nakresliObdelnik2(zofka, 200, 150);
          nakresliKolecko2(zofka, 75);
          nakresliObdelnik(zofka);
          zofka.turnLeft(90);
          zofka.penUp();
          zofka.move(120);
          zofka.penDown();
          zofka.turnRight(180);
          nakresliKolecko2(zofka, 30);
          zofka.turnLeft(180);
          zofka.penUp();
          zofka.move(80);
          zofka.penDown();
          zofka.turnRight(180);
          nakresliKolecko2(zofka, 30);
          zofka.turnLeft(180);
          zofka.penUp();
          zofka.move(50);
          zofka.turnLeft(90);
          zofka.move(40);
          zofka.penDown();
          zofka.turnLeft(180);
          nakresliPravouhlyTrojuhelnik(zofka);











    }


    // CAST 1

    public void nakresliCtverec(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(190);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.move(80);
            zofka.turnLeft(90);
            zofka.move(250);
            zofka.turnLeft(90);
        }
    }

    public void nakresliTrojuhelnik (Turtle zofka) {
          zofka.move(150);
          zofka.turnRight(140);
          zofka.move(150);
          zofka.turnRight(110);
          zofka.move(100);

    }


    public void nakresliKolecko (Turtle zofka) {
         for (int i = 0; i < 24; i++) {
         zofka.move(50);
         zofka.turnRight(15);
        }

    }


    // CAST 2

    public void nakresliCtverec2(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }
    public void nakresliObdelnik2(Turtle zofka, double stranaA, double stranaB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnRight(90);
            zofka.move(stranaB);
            zofka.turnRight(90);
        }
    }
    public double vypocitejDelkuTretiStrany(double stranaA, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((stranaA
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }

    public void nakresliTrojuhelnik2 (Turtle zofka, double stranaA,double tretiStrana, double uhelMeziRameny) {
        zofka.move(stranaA);
        zofka.turnRight(uhelMeziRameny);
        zofka.move(stranaA);
        zofka.turnRight((360 - uhelMeziRameny)/2);
        zofka.move(tretiStrana);
    }

    public void nakresliKolecko2 (Turtle zofka, double polomer) {
        for (int i = 0; i < 24; i++) {
            zofka.move(polomer*2* Math.PI/24);
            zofka.turnRight(15);
        }
    }

    // CAST 3
    public void nakresliCtvrtKolecka (Turtle zofka, double polomer) {
        for (int i = 0; i < 6; i++) {
            zofka.move(polomer*2* Math.PI/24);
            zofka.turnRight(15);
        }
    }
    public void nakresliKornout (Turtle zofka, double polomer) {
        for (int i = 0; i < 23; i++) {
            zofka.move(polomer*2* Math.PI/24);
            zofka.turnRight(15);
        }
    }
    public void nakresliTrojuhelnikA (Turtle zofka) {
        zofka.move(145);
        zofka.turnRight(110);
        zofka.move(200);
        zofka.turnRight(140);
        zofka.move(200);

    }

    public void nakresliPravouhlyTrojuhelnik (Turtle zofka) {
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(120);
        zofka.turnLeft(135);
        zofka.move(80);

    }
}
