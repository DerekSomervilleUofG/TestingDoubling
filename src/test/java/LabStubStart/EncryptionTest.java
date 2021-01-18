package LabStubStart;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {
    Encryption encryption = new Encryption();

    @Test
    void encryptMessageProtected() {
        String message = "Hello world";
        assertEquals("Igopt&~w{mf",encryption.encryptMessage(message,"123.456.789",true));
    }

    @Test
    void unEncryptMessageProtected() {
        String message = "Hello world";
        assertEquals(message,encryption.encryptMessage("Igopt&~w{mf","123.456.789",false));
    }

    @Test
    void ipAddressAsArray() {
        List<Integer> expectedDigits = new ArrayList<Integer>();
        for (int counter=1;counter <= 9; counter++){
            expectedDigits.add(counter);
        }
        assertEquals(expectedDigits,encryption.ipAddressAsArray("123.456.789"));
    }

    @Test
    void encryptChar() {
        assertEquals('b',encryption.encryptChar('a',1,true));
    }

    @Test
    void unEncryptChar() {
        assertEquals('a',encryption.encryptChar('b',1,false));
    }

    @Test
    void testEncryptUnEncryptMessagePublic() {
        String message = "Hello world";
        assertEquals(message,encryption.unEncryptMessage(encryption.encryptMessage(message)));
    }

    @Test
    void testEncryptMessagePublic() {
        String message = "Hello world";
        assertEquals("Innmu(xpure",encryption.encryptMessage(message));
    }

    @Test
    void testUnEncryptMessagePublic() {
        String message = "Hello world";
        assertEquals(message,encryption.unEncryptMessage("Innmu(xpure"));
    }
}