package LabStubStart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternetProtocolTest {

    InternetProtocol internetProtocol = new InternetProtocol();

    @Test
    void getIP() {
        assertEquals(internetProtocol.getIP().getHostAddress(),"192.168.1.136");
    }
}