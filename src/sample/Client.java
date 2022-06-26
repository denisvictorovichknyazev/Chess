package sample;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Денис on 14.07.2017.
 */
public class Client {
    public void send(byte[] data){
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("255.255.255.255");
            DatagramPacket pack =new DatagramPacket(data,data.length,address,1798);
            socket.send(pack);
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
