package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {



    @Test
    public void SringWithonegAtbegin(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("gabs");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithonegAteind(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("abshfg");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithOneg(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absghf");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithTwoogateind(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("abshfgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void SringWithTwoogatbegin(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("ggabs");
        Assertions.assertTrue(result);
    }

    @Test
    public void SringWithTwoog(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absgghf");
        Assertions.assertTrue(result);
    }

    @Test
    public void SringWithTwooAndOneg(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absgghkglf");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithOneAndTwoog(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("algjbsgghf");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithSeparateOneg(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absghmngopf");
        Assertions.assertFalse(result);
    }

    @Test
    public void SringWithSeparateTwoog(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absgghmnggopf");
        Assertions.assertTrue(result);
    }

    @Test
    public void SringWithMoreThang(){
        GHappy s = new GHappy();
        boolean result = s.gHappy("absgggeft");
        Assertions.assertTrue(result);
    }

}
