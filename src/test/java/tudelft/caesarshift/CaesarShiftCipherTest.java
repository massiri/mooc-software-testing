package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void CesarInvalidString(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("abs45dfjh", 2);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void CesarZero(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", 0);
        Assertions.assertEquals("ik ben nog niet klaar", result);
    }

    @Test
    public void CesarPositiveShift(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", 7);
        Assertions.assertEquals("pr ilu uvn upla rshhy", result);
    }

    @Test
    public void Cesar26Shift(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", 26);
        Assertions.assertEquals("ik ben nog niet klaar", result);
    }

    @Test
    public void CesarGrandPositiveShift(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", 39);
        Assertions.assertEquals("vx ora abt avrg xynne", result);
    }

    @Test
    public void CesarNegativeShift(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", -5);
        Assertions.assertEquals("df wzi ijb idzo fgvvm", result);
    }

    @Test
    public void CesarGrandNegativeShift(){
        CaesarShiftCipher s = new CaesarShiftCipher();
        String result = s.CaesarShiftCipher("ik ben nog niet klaar", -55);
        Assertions.assertEquals("fh ybk kld kfbq hixxo", result);
    }

}
