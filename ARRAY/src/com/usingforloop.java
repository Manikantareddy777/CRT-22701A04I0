package com;

public class usingforloop {

    public static void main(String[] args) {

        int[] marks = {98, 98, 98, 100, 100, 100};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("--------------------------");
        for(int i=marks.length-1;i>=0;i--) {
        	System.out.println(marks[i]);
        	
        }
        System.out.println("--------------------------");

        String[] names = {"mani", "sai", "veera", "reddy"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("=========================");
        for (int i=names.length-1;i>=0;i--) {
        	System.out.println(names[i]);
        }
    }
}