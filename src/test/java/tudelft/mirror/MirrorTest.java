package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MirrorTest {

    @Test
    // test null string  mirroEnds("") ==> "";
    public void test0(){
        String t0 = "";
        Mirror m0 = new Mirror();
        String result = m0.mirrorEnds(t0);
        Assertions.assertEquals("",result);
    }

    @Test
    // test mirror is different than string mirroEnds("abXYZba") ==> "ab";
    public void test1(){
        String t1 = "abXYZba";
        Mirror m1 = new Mirror();
        String result = m1.mirrorEnds(t1);
        Assertions.assertEquals("ab",result);
    }

    @Test
    // full mirro is the same as the string mirrorEnds("abcba") ==> "abcba"
    public void test2(){
        String t2 = "abcba";
        Mirror m2 = new Mirror();
        String result = m2.mirrorEnds(t2);
        Assertions.assertEquals("abcba",result);

    }

    @Test
    // no mirro string mirrorEnds("baba") ==> ""
    public void test3(){
        String t3 = "baba";
        Mirror m3 = new Mirror();
        String result = m3.mirrorEnds(t3);
        Assertions.assertEquals("",result);

    }

    @Test
    // mirro string uneven mirrorEnds("aba") ==> ""
    public void test4(){
        String t4 = "aba";
        Mirror m4 = new Mirror();
        String result = m4.mirrorEnds(t4);
        Assertions.assertEquals("aba",result);

    }

    @Test
    // mirro string even mirrorEnds("aba") ==> ""
    public void test5(){
        String t5 = "aa";
        Mirror m5 = new Mirror();
        String result = m5.mirrorEnds(t5);
        Assertions.assertEquals("aa",result);

    }


}
