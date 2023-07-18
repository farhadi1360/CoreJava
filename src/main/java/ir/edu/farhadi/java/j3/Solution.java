package ir.edu.farhadi.java.j3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution {
    static class Acquaintance {
        String name;

        public Acquaintance(String name) {
            this.name = name;
        }

        public void getStatus() {
            System.out.println("The Name of Acquaintance Level is : " + name);
        }
    }

    static class Friend {
        private String name;
        private String homeTown;

        public Friend(String name, String homeTown) {
            this.name = name;
            this.homeTown = homeTown;
        }

        public void getStatus() {
            System.out.println("The Name of Friend Level is : " + name + "He is from " + homeTown);
        }
    }

    static class BestFriend {
        private String name;
        private String homeTown;
        private String favoriteSong;

        public BestFriend(String name, String homeTown, String favoriteSong) {
            this.name = name;
            this.homeTown = homeTown;
            this.favoriteSong = favoriteSong;
        }

        public void getStatus() {
            System.out.println("The Name of BestFriend Level is : " + name + "He is from " + homeTown + " and his favorite Song is :" + favoriteSong);
        }
    }

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();

        int t = Integer.parseInt(sub);
        for (int i = 0; i < t; i++) {

            String[] input = sc.nextLine().split(" ");

            if (input[0].equals("Acquaintance")) {
                String friendName = input[1];
                Acquaintance acq = new Acquaintance(friendName);
                acq.getStatus();
            } else if (input[0].equals("Friend")) {
                String friendName = input[1];
                String homeTown = input[2];
                Friend frnd = new Friend(friendName, homeTown);
                frnd.getStatus();
            } else if (input[0].equals("BestFriend")) {
                String friendName = input[1];
                String homeTown = input[2];
                String favoriteSong = input[3];
                BestFriend bf = new BestFriend(friendName, homeTown, favoriteSong);
                bf.getStatus();
            }
        }
    }

}
