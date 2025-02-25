package javaProgramming.level1;

import java.util.Scanner;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius =  6378;
        double sphere =  (4/3*3.14*(radius*radius*radius));
        double milessphere = sphere*1.12;

        System.out.printf(" The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",sphere,milessphere);
    }
}
