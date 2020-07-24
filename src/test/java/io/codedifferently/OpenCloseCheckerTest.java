package io.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OpenCloseCheckerTest {

    OpenCloseChecker openC;

    @Before
    public void initialize() {
        openC = new OpenCloseChecker();
    }

    @Test
    public void test1(){
        //Given
        String sentence = "a(b)c(d)e(f)g";
        boolean expected = true;
        
        //When
        boolean actual = OpenCloseChecker.Parentheses(sentence);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        //Given
        String sentence = ")";
        boolean expected = false;
        
        //When
        boolean actual = OpenCloseChecker.Parentheses(sentence);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        //Given
        String sentence = "a(bcd(ef))";
        boolean expected = true;
        
        //When
        boolean actual = OpenCloseChecker.Parentheses(sentence);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        //Given
        String sentence = "a(bc(d)))";
        boolean expected = false;
        
        //When
        boolean actual = OpenCloseChecker.Parentheses(sentence);

        //Then
        Assert.assertEquals(expected, actual);
    }

}