package LabStubStart;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetProtocol {
    public InetAddress getIP(){
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return ip;
    }
}
