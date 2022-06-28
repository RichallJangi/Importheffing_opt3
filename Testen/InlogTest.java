
import org.junit.jupiter.api.Test;



import static org.junit.Assert.*;

public class InlogTest {

    @Test
    public void inlog() {

        //CC Test
        assertFalse(Main.inlog("RJ", "234"));
        assertFalse(Main.inlog("werewr", "qwerty"));

        //DC Test
        assertTrue(Main.inlog("RJ","qwerty"));
        assertFalse(Main.inlog("sdad", "dads"));

        //CD Test
        assertFalse(Main.inlog("sdad", "dads"));
        assertTrue(Main.inlog("RJ","qwerty"));

        //MC/DC Test
        assertFalse(Main.inlog("sdad", "qwerty"));
        assertFalse(Main.inlog("RJ", "dads"));
        assertTrue(Main.inlog("RJ","qwerty"));

        //MCC Test
        assertFalse(Main.inlog("sdad", "qwerty"));
        assertFalse(Main.inlog("RJ", "dads"));
        assertTrue(Main.inlog("RJ","qwerty"));
        assertFalse(Main.inlog("sdad", "dads"));

    }
}