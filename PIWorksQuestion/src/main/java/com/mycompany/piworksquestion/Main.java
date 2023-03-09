/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.piworksquestion;

import java.util.Scanner;

/**
 *
 * @author ZenBook
 */
public class Main {
    
    static int[] arr = {1, 2, 2, 3, 3, 3, 5, 7, 11, 15};
    
    public static int calculateFactorial(int index) {
        int result = 1;
        if (index == 0) {
            return result;
        } else {
            while (index > 0) {
                result *= index--;
            }
            return result;
        }
    }

    public static double calculatePower(int index) {
        if(index == 0){
            return 1;
        }
        else{
            return Math.pow(arr[index], index);
        }
    }
    
    public static double totalSummation(){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += calculatePower(i)/(double)calculateFactorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(totalSummation());
    }

}
