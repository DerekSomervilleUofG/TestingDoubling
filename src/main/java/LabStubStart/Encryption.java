package LabStubStart;

import LabStubComplete.IPInterface;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Encryption {

    private IPInterface internetProtocol;

    Encryption(IPInterface internetProtocol){
        this.internetProtocol = internetProtocol;
    }

    public String encryptMessage(String message){
        String encryptedMessage = encryptMessage(message,internetProtocol.getIP(),true);
        return encryptedMessage;
    }

    public String unEncryptMessage(String message){
        String encryptedMessage = encryptMessage(message,internetProtocol.getIP(),false);
        return encryptedMessage;
    }

    protected List<Integer> ipAddressAsArray(String ip){
        List<Integer> ipDigits = new ArrayList<Integer>();
        for (char ch: ip.toCharArray()){
            if (Character.isDigit(ch)){
                ipDigits.add(Character.getNumericValue(ch));
            }
        }
        return ipDigits;
    }

    protected char encryptChar(char ch,int encryptNumber,boolean direction){
        char result;
        int asciiChar = (int) ch;
        if (direction) {
            result = (char) ((asciiChar + encryptNumber)%256);
        } else {
            result = (char) ((asciiChar - encryptNumber)%256);
        }
        return result;
    }

    protected String encryptMessage(String message, String ip,boolean direction){
        String encryptedMessage = "";
        List<Integer> ipDigits = ipAddressAsArray(ip);
        int ipLength = ipDigits.size();
        for (int counter =0; counter < message.length(); counter++){
            encryptedMessage += encryptChar(message.charAt(counter),ipDigits.get(counter%ipLength),direction);
        }
        return encryptedMessage;
    }
}
