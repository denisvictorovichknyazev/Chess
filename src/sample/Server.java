package sample;

import javafx.application.Platform;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Денис on 14.07.2017.
 */
public class Server implements Runnable {
    private byte[] data;
    private boolean flag = true;
    private Controller contr;
    Server(Controller contr){
        this.contr = contr;
    }
    public void run() {
        data = new byte[5];
        try {
            DatagramSocket socket = new DatagramSocket(1798);
            InetAddress address = InetAddress.getByName("255.255.255.255");
            DatagramPacket packet = new DatagramPacket(data, data.length);
            while (flag) {
                socket.receive(packet);
                if (packet.getData() != null) {
                    flag = false;
                    System.out.print("ыыыыыыыыыыыыыыыыыыыыы");
                }

            }
            socket.close();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                       contr.board.getCell(data[2],data[3]).setFigure(contr.board.getCell(data[0],data[1]).getFigure());
                       contr.board.getCell(data[0],data[1]).setFigure(null);
                       contr.check_counter = data[4];
                       contr.paint();
                    }
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] receive() {
        return data;
    }
}
