package com.forpgm.mathutil.main;

import com.forpgm.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class MathUtil {
    
    //modify code in local, later upload to server
    public static void printMsg(){
        
    }
    //hàm là static vì tính xong tear về, không nhớ nhung gì cả
    //thường các thư viện dùng chung có tính toán số liệu ta hay dùng static

//    public static void main(String[] args) {
//        //test case #01:
//        //n = 0, exp value: 1, actual value: ?, status: passed/ failed
//        int n = 0;
//        long expectedValue = 1; //hi vọng 0! = 1
//        long actualValue; //=? chờ hàng trả về
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | expected: " + expectedValue + " actual: " + actualValue);
//        //test case #02:
//        //n = 5, exp value: 120, actual value: ?, status: passed/ failed
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | expected: " + expectedValue + " actual: " + actualValue);
//        
//        //test case #03:
//        //n = -1, ex value: thấy ngoại lệ, actual value: ? status: passed/ failed
//        System.out.println("check if the illegal argument exception is thrown");
//        n = -1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("-1! | expected: " + expectedValue + " actual: " + actualValue);
//        
//    }
    //0! = 1! = 1
    //n = 0..20! vì n=21! vượt 18 số 0, 18 số 0 là vừa đủ long
    public static void main(String[] args) {
        // cách 2: test hàm bằng cách pop up
        int n = 0;
        long expectedValue = 1; //hi vọng 0! = 1
        long actualValue; //=? chờ hàng trả về
        actualValue = MathUtility.getFactorial(n);
        String result = n + "! | Expected: " + expectedValue + " | Actual: " + actualValue;
        
        JOptionPane.showMessageDialog(null, result);
    }
}
