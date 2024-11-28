/*
* File: solution.java
* Author: Fülöp Ervin
* Copyright: 2024, Fülöp Ervin
* Group: Szoft II/2/N
* Date: 2024-11-28
* Github: https://github.com/Ervincsao
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class solution {
    public void startCalc() {

        System.out.println("Gúla térfogat számítás");

        Scanner sc = new Scanner(System.in);

        System.out.print("Oldal: ");
        String sideStr = sc.nextLine();
        Double side = Double.parseDouble(sideStr);

        System.out.print("Magasság: ");
        String heightStr = sc.nextLine();
        Double height = Double.parseDouble(sideStr);

        Double volume = 1.0 / 3.0* Math.pow(side, 2) * height;
        System.out.printf("Térfogat: %f\n", volume);

        sc.close();
    }

}
