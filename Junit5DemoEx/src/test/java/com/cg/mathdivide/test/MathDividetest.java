package com.cg.mathdivide.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cg.MathDivideDemo.MathOperationsDemo;

import org.junit.jupiter.api.AfterAll;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathDividetest {
    
    MathOperationsDemo dm;
    TestInfo testInfo;
    static TestReporter testReporter;
    static int i = 0;
    

 

    
    
    @BeforeAll
    public static void beforeAllTest() {
        
        System.out.println("Your Test begins now");
    }
    
    @BeforeEach
    public void beforeTest(TestInfo testInfo, TestReporter testReporter) {
        dm = new MathOperationsDemo();
        this.testInfo=testInfo;
        this.testReporter=testReporter;    
        i = i +1;
        System.out.println("Test " + (i) + " begins");
    }
    @AfterEach
    public void afterTest() {
        System.out.println("Test " + i + " ends");
    }
    
    @AfterAll
    public static void afterAllTest() {
        System.out.println("All Test completed" + testReporter);
    }

 

    @Nested
    @DisplayName("test for methodA")
    class A{
        
        @BeforeEach
        void beforeEachA() {
            System.out.println("this is class A");
        }
        
        @Test
        void testMethodForA() {
            
            System.out.println("this is test method");
        }
    }
    
    @Test
    @DisplayName("calc")
    @Tag("add")
    @Tag("sub")
    public void testCalc() {
        testReporter.publishEntry("maths calc " + testInfo.getTags());
        
        assertEquals(4, dm.add(2, 2));
        assertEquals(4, dm.multiply(2, 2));
        assertEquals(1, dm.divide(2, 2));
    }
    @EnabledOnOs(OS.LINUX)
    @Test
    @DisplayName("dividebyzero")
    public void testDivideByZeroException() {
    testReporter.publishEntry("divide by zero " + testInfo.getTags());
    
        assertThrows(
                ArithmeticException.class, 
                () -> dm.divide(1, 0),
                "Divide by zero should be thrown");
    }
    @Disabled
    @Test
    @DisplayName("Testall")
    public void testMultiply() {
        testReporter.publishEntry("calculatee area " + testInfo.getTags());
        
        assertAll(    () -> assertEquals(4, dm.add(2, 2)),
                    () -> assertEquals(8, dm.multiply(4, 2))
                );

 

    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 9, Integer.MAX_VALUE})
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        testReporter.publishEntry("find odd " + testInfo.getTags());
        assertTrue(dm.isOdd(number));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void isEven_ShouldReturnTrueForEvenNumbers(int number) {
        testReporter.publishEntry("find even " + testInfo.getTags());
        assertTrue(dm.isEven(number));
    }
}