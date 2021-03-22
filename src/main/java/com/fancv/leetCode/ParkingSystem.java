package com.fancv.leetCode;

public class ParkingSystem {

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }

    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {

        this.big = big;
        this.medium = medium;
        this.small = small;

    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                big--;
                if (big >= 0) {
                    return true;
                }
                break;
            case 2:
                medium--;
                if (medium >= 0) {
                    return true;
                }
                break;
            case 3:
                small--;
                if (small >= 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
