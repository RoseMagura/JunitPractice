package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.*;

public class HelperTest {
    @Test
	public void testGetCount(){
        List<String> empNames =
                Arrays.asList("alex", "", "kesha", "sareeta", "", "", "peter");
        assertEquals(3, Helper.getCount(empNames));
    }

	@Test
    public void testGetStats(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        assertEquals(19, Helper.getStats(yrsOfExperience).getMax());
        assertEquals(1, Helper.getStats(yrsOfExperience).getMin());
        assertEquals(88, Helper.getStats(yrsOfExperience).getSum());
        assertEquals(8.8, Helper.getStats(yrsOfExperience).getAverage(), 0.01);
    }

    @Test
    public void testGetFilteredList(){
        List<String> empNames =
                Arrays.asList("alex", "", "kesha", "sareeta", "", "", "peter");
        List<String> expected = Arrays.asList("alex", "kesha", "sareeta", "peter");
        assertEquals(expected, Helper.getFilteredList(empNames));
    }
    @Test
    public void testGetStringsOfLength3() {
        List<String> strings = Arrays.asList("abc", "xylophone", "cat", "");
        assertEquals(2, Helper.getStringsOfLength3(strings));
    }

    @Test
    public void testGetSquareList(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> expectedValues =
                Arrays.asList(169, 16, 225, 36, 289, 64, 361, 1, 4, 9);
        assertEquals(expectedValues, Helper.getSquareList(yrsOfExperience));
    }

    @Test
    public void testGetMergedList(){
        List<String> empNames =
                Arrays.asList("Alex", "", "Kesha", "Sareeta", "", "", "Peter");
        String expected = "Alex, Kesha, Sareeta, Peter";
        assertEquals(expected, Helper.getMergedList(empNames));

    }
}
