package com.demo;
import static org.junit.Assert.*;
import org.junit.Test;
public class SimpletestTest {
    @Test
    public void multest(){
        simpletest st=new simpletest();
        assertEquals(25,st.multiple(5,5));
    }
    @Test
    public void divtest(){
        simpletest st=new simpletest();
        assertEquals(5.0,st.divide(25.0,5.0),0.1);
    }
    @Test
    public void divzerotest(){
        simpletest st=new simpletest();
        assertEquals(0,st.divide(25.0,0),0.1);
    }
    @Test
    public void facttest(){
        simpletest st=new simpletest();
        assertEquals(120,st.factorial(5));
    }   
}
