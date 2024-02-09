import com.smu.mscda.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestCapitalizeAndGenerateMD5Hex {
    private String name = "smu";

    @Test
    public void testCapital(){
        assertEquals("Smu", Main.Capital(name));
    }

    @Test
    public void testMD5(){
        assertEquals("3773300c2f413cc7136f8d74b305519c", Main.Md5(name));
    }


}
