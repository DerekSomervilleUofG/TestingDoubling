package LabStubStart;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetProtocol {
    public String getIP(){
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return ip;
    }
}
