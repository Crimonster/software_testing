package cn.tjuscs.st;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FindBillsTest {
    private int input;
    private boolean expected;
    private FindBills judge = null;

    public FindBillsTest(int input,boolean expected){
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp(){
        judge = new FindBills();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {55,true},
                {54,false},
                {93,true},
                {83,true},
                {88,true},
                {94,false}
        });
    }

    @Test
    public void testFindOrNot() {
        assertEquals(this.expected, judge.findOrNot(input));
    }
//    @Test
//    public void findOrNot() {
//        assertEquals( true,judge.findOrNot(55));
//        assertEquals( false,judge.findOrNot(54));
//        assertEquals( true,judge.findOrNot(93));
//        assertEquals( true,judge.findOrNot(83));
//        assertEquals( true,judge.findOrNot(88));
//        assertEquals( false,judge.findOrNot(94));
//    }
}