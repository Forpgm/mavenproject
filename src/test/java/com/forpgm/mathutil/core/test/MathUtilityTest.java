/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.forpgm.mathutil.core.test;

// qui tắc đặt tên package trong java
// tên miền cty đảo ngược, đi kèm thông tin dự án và module
// com.tên-cty.tên-dự-án.tên-class
// com.microsoft.sqlserver.jdbc
// com.forpgm.mathutil.core.

import com.forpgm.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
// class này chứa các test case dùng để test code của class chính bên
// MathUtility
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // test case: là bộ data đầu vào + thao tác nhập xuất trên app, mh, hàm
    //            để verify 1 hàm, 1 màn hình, 1 chức năng chạy đúng hay sai
    
    // test case 1: check getF() with n = 0
    // input/given: n=0
    // steps/procedure(bước test):
    // call method getFactorial(n)
    // Expected result: 1
    // Actual result: ??? chờ chạy hàm mới biết
    // status: passed/failed
     @Test  // framework ép ta phải viết code theo 1 qui tắc nào đó
            // library cho viết tự do, gọi tự do
            // framework là thư viện, nhưng thư viện không hẳn là framework
     
    public void testFactorialGivenRightArg0ReturnWell(){
         assertEquals(1, MathUtility.getFactorial(0));
    }
    
    // test case 2: check getF() with n = 1
    // input/given: n=1
    // steps/procedure(bước test):
    // call method getFactorial(n)
    // Expected result: 1
    // Actual result: ??? chờ chạy hàm mới biết
    // status: passed/failed
     @Test  // framework ép ta phải viết code theo 1 qui tắc nào đó
            // library cho viết tự do, gọi tự do
            // framework là thư viện, nhưng thư viện không hẳn là framework
     
    public void testFactorialGivenRightArg1ReturnWell(){
         assertEquals(1, MathUtility.getFactorial(1));
    }
    
    // test case 3: check getF() with n = 5
    // Expected result: 120
    // Actual result: ??? chờ chạy hàm mới biết
    // status: passed/failed
     
    @Test
    public void testFactorialGivenRightArg5ReturnWell(){
         assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnWell(){
         assertEquals(1, MathUtility.getFactorial(1));
         assertEquals(2, MathUtility.getFactorial(2));
         assertEquals(6, MathUtility.getFactorial(3));
         assertEquals(24, MathUtility.getFactorial(4));
         assertEquals(120, MathUtility.getFactorial(5));
    }
    
    // thấy ngoại lệ phải mừng rơi nước mắt
    // test case 5: check getF() with n = -1 | the method throws Exception
    @Test
    public void testFactorialGivenWrongArgNegative1ThrowException(){
         // MathUtility.getFactorial(-1);
         assertThrows(IllegalArgumentException.class, ()-> {
         MathUtility.getFactorial(-1);});
    }
}
