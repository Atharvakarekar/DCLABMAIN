package DcCode;

import java.io.*;
import java.net.*;

public class Clientone_07 {

        public static void main(String args[]) throws IOException {

            Socket se = new Socket("localhost", 7000);
            PrintStream out = new PrintStream(se.getOutputStream());

            ServerSocket ss = new ServerSocket(7001);
            Socket s1 = ss.accept();

            BufferedReader in1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            PrintStream out1 = new PrintStream(s1.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "Token";

            while (true) {
                if (str.equalsIgnoreCase("Token")) {
                    System.out.println("Do you want to send some data?");
                    System.out.println("Enter Yes or no");
                    str = br.readLine();

                    if (str.equalsIgnoreCase("Yes")) {
                        System.out.println("Enter the data");
                        str = br.readLine();
                        out1.println(str);
                        out1.println("Token");
                        System.out.println("Waiting for Token");
                        str = in1.readLine();
                    }
                }
            }
        }
    }

