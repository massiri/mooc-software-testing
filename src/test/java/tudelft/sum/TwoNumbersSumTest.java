package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TwoNumbersSumTest {

    @Test
    public void sameLengh() {
        TwoNumbersSum result = new TwoNumbersSum();
        ArrayList<Integer> l1 = new ArrayList<Integer> ();
        ArrayList<Integer> l2 = new ArrayList<Integer> ();
        ArrayList<Integer> test1 = new ArrayList<Integer> ();
        ArrayList<Integer> test2 = new ArrayList<Integer> ();
        l1.add(2);l1.add(4);l1.add(3);
        l2.add(5);l2.add(6);l2.add(4);
        test2.add(8);test2.add(0);test2.add(7);
        test1 = result.addTwoNumbers(l1,l2);
        Assertions.assertEquals(test2 , test1);
    }

    @Test
    public void differentLengh() {
        TwoNumbersSum result = new TwoNumbersSum();
        ArrayList<Integer> l1 = new ArrayList<Integer> ();
        ArrayList<Integer> l2 = new ArrayList<Integer> ();
        ArrayList<Integer> test1 = new ArrayList<Integer> ();
        ArrayList<Integer> test2 = new ArrayList<Integer> ();
        l1.add(2);l1.add(4);l1.add(3);l1.add(3);
        l2.add(5);l2.add(6);l2.add(4);
        test2.add(3);test2.add(8);test2.add(0);test2.add(7);
        test1 = result.addTwoNumbers(l1,l2);
        Assertions.assertEquals(test2 , test1);
    }

    @Test
    public void sameLenghDiffResut() {
        TwoNumbersSum result = new TwoNumbersSum();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer> ();
        ArrayList<Integer> test1 = new ArrayList<Integer> ();
        ArrayList<Integer> test2 = new ArrayList<Integer> ();
        l1.add(1);l1.add(0);l1.add(3);
        l2.add(2);l2.add(2);l2.add(8);
        test2.add(1);test2.add(1);test2.add(2);test2.add(3);
        test1 = result.addTwoNumbers(l1,l2);
        Assertions.assertEquals(test2 , test1);
    }

}
