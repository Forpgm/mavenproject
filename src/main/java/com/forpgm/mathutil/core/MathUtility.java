/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.forpgm.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtility {

    public static long getFactorial(int n) {
        long product = 1;// tích kết quả phép nhân
        //update code again to see green forever
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 - 20");

        }
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}

//5! = 1.2.3.4.5
//5! = 5.4!
//4! = 1.2.3.4
//4! = 4.3!
//n! = n.(n-1)! | công thức đệ qui - recursion

//búp bê người nga

//nếu ta xài CI trong project, thì lợi điểm là mỗi lần sửa code
//dân dev không cần mất sức test lại code của mình đúng/sai
//do cơ chế tự động run test case của CI lo giúp

//toàn bộ việc test lại code được tự động hóa, PM, dev chỉ cần nhìn vào
//màu xanh là đủ, biể rằng việc sửa code ngon, vì pass được bộ test

//việc test lại hàm đã từng test => regression testing
//                               => kiểm thử hồi qui
