package cn.tjuscs.st;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindBillsTest {
    FindBills judge;
    @Before
    public void setUp(){
        judge = new FindBills();
    }
    @Test
    public void findOrNot() {
        assertEquals( true,judge.findOrNot(55));
        assertEquals( false,judge.findOrNot(54));
        assertEquals( true,judge.findOrNot(93));
        assertEquals( true,judge.findOrNot(83));
        assertEquals( true,judge.findOrNot(88));
        assertEquals( false,judge.findOrNot(94));
    }
}