package com.java;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       int result =  solve(2, 2);
        System.out.println(result);
    }

    public static int solve(int x, int y) {
        int temp = (x - 1) * (y - 1);
        int ans = (int) Math.pow(2, temp);
        if ((x + y) % 2 != 0) {
            return ans;
        } else {
            return (2 * ans);
        }
    }
}
