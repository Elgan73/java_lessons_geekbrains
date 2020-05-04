package DeepJava.Lesson6.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class NewClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 87);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Scanner input = new Scanner(System.in);

        new Thread(() -> {

            while (true) {
                try {
                    String myMsg = input.nextLine();
                    if (myMsg.equals("#quit") || myMsg.equals("#exit")) {
                        out.writeUTF(myMsg);
                        out.flush();
                        break;
                    }
                    out.writeUTF(myMsg);
                    out.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();


        new Thread(() -> {
            while (true) {
                try {
                    String serverMsg = in.readUTF();

                    if (!serverMsg.isEmpty()) {
                        System.out.println("Server message: " + serverMsg + "\n");
                    }
                    if (socket.isClosed()) {
                        System.out.println("Server has stopped");
                        socket.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }).start();

    }
}
