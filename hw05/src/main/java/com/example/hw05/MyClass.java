package com.example.hw05;

public class MyClass {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("第一個小時 :");
        int hu1=scanner.nextInt();

        System.out.println("第一個分鐘:");
        int min1=scanner.nextInt();

        System.out.println("第一個秒數:");
        int sec1=scanner.nextInt();

        System.out.println("第二個小時 :");
        int hu2=scanner.nextInt();

        System.out.println("第二個分鐘:");
        int min2=scanner.nextInt();

        System.out.println("第二個秒數:");
        int sec2=scanner.nextInt();

        int allsec1=(hu1*3600)+(min1*60)+sec1;
        int allsec2=(hu2*3600)+(min2*600)+sec2;

        System.out.println("相差的秒數:"+Math.abs(allsec1-allsec2));
    }
}