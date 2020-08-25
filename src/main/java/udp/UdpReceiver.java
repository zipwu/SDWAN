package udp;

import sun.nio.cs.StandardCharsets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpReceiver {
    private static DatagramSocket datagramSocket;

    public static void main(String[] args){
        try {
            datagramSocket = new DatagramSocket(1000);//设置监听端口
            System.out.println("****************服务器开始监听数据********************");
            while (true){
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
                datagramSocket.receive(receivePacket);
                String deviceData = new String(receivePacket.getData(),receivePacket.getOffset(),receivePacket.getLength());
                InetAddress deviceIp = receivePacket.getAddress();
                int devicePort = receivePacket.getPort();
                System.out.println(deviceData);
                System.out.println("设备发送ip："+ deviceIp.getHostAddress()+" 设备发送port:"+ devicePort);
                byte[] sendData = "Received!".getBytes();
                receivePacket.setData(sendData);
                datagramSocket.send(receivePacket);


            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class HandleThread extends Thread{

    }
}
