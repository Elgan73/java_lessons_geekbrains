package DeepJava.Lesson6.server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatSrv {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(87);
        Socket connected = server.accept();

        System.out.println("Server is started");
        System.out.println("Connected " + connected.getInetAddress());

        DataInputStream in = new DataInputStream(connected.getInputStream());
        DataOutputStream out = new DataOutputStream(connected.getOutputStream());
        Scanner consoleInput = new Scanner(System.in);

        new Thread(() -> {
            boolean flag = true;
            while (flag) {
                try {
                    String serverMsg = consoleInput.nextLine();
                    out.writeUTF(serverMsg + "\n");
                    out.flush();
                } catch (Exception e) {
                    System.out.println("Link is closed");
                    flag = false;
                }
            }
        }).start();


        new Thread(() -> {
            boolean flag = true;
            while (flag) {
                try {
                    String clientMessage = in.readUTF();
                    System.out.println("Client: " + clientMessage + "\n");
                    if (connected.isClosed()) {
                        server.close();
                    }
                } catch (Exception e) {
                    System.out.println("Client disconnected");
                    flag = false;

                }
            }
        }).start();

    }
}
