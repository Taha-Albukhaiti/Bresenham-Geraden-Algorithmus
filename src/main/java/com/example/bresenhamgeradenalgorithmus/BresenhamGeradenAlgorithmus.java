package com.example.bresenhamgeradenalgorithmus;

public class BresenhamGeradenAlgorithmus {
    public static void bresenhamGeradenAlgorithmus(int xAnf, int xEnd, int yAnf, int yEnd) {
        int deltaX = xEnd - xAnf;
        int deltaY = yEnd - yAnf;
        int n = 0;
        int e = Math.abs(deltaX) - (2 * Math.abs(deltaY));
        System.out.println("___________________________________________");
        System.out.println(n + "   " + xAnf + "   " + yAnf + "   ");
        if (Math.abs(deltaX) >= Math.abs(deltaY)) {
            while (xAnf != xEnd) {
                n++;
                xAnf = xAnf + (deltaX >= 0 ? 1 : -1);
                if (e > 0) {
                    //  yAnf = yAnf;
                    System.out.println(n + "   " + xAnf + "   " + yAnf + "   " + e);
                    e = e - (2 * Math.abs(deltaY));
                } else {
                    yAnf = yAnf + (deltaY >= 0 ? 1 : -1);
                    System.out.println(n + "   " + xAnf + "   " + yAnf + "   " + e);
                    e = e + (2 * (Math.abs(deltaX) - Math.abs(deltaY)));
                }
            }
        } else {

            while (yAnf != yEnd) {
                n++;
                yAnf = yAnf + (deltaY >= 0 ? 1 : -1);
                if (e > 0) {
                    //xAnf = xAnf;
                    System.out.println(n + "   " + xAnf + "   " + yAnf + "   " + e);
                    e = e - (2 * Math.abs(deltaX));
                } else {
                    xAnf = xAnf + (deltaX >= 0 ? 1 : -1);
                    System.out.println(n + "   " + xAnf + "   " + yAnf + "   " + e);
                    e = e + (2 * (Math.abs(deltaY) - Math.abs(deltaX)));
                }
            }

        }
    }

    public static void main(String[] args) {
        bresenhamGeradenAlgorithmus(-414, 74, 205, -53);
    }
}
