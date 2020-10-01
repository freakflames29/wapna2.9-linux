//for linux

import java.io.IOException;
import java.util.Scanner;

public class myupwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome in Wapna2.9");
        System.out.println("This is your own Desktop assitant ");
        System.out.println("To know every command press 'A'");
        String c1, v1;
        while (true) {
            System.out.println("Enter the command");
            c1 = sc.nextLine();
            v1 = c1.toLowerCase();
            if (v1.equals("atom")) {
                try {

                    System.out.println("Opening Atom text editor....");
                    String s = "/usr/share/atom/atom";
                    Runtime r = Runtime.getRuntime();
                    Process p = r.exec(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (v1.equals("clion")) {
                try {
                    System.out.println("Opening CLion ...");
                    String s1 = "/snap/clion/126/snap/gui/clion.desktop";
                    Runtime r1 = Runtime.getRuntime();
                    Process p1 = r1.exec(s1);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else if (v1.equals("ij")) {
                try {
                    System.out.println("Opening Intellij IDEA community edition...");
                    String s2 = "/snap/intellij-idea-community/252/snap/gui/intellij-idea-community.desktop";
                    Runtime r2 = Runtime.getRuntime();
                    Process p2 = r2.exec(s2);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            else if(v1.equals("wps"))
            {
                try {
                    System.out.println("Opening WPS Office...");
                    String s3 = " /usr/bin/wps";
                    Runtime r3 = Runtime.getRuntime();
                    Process p3 = r3.exec(s3);
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            else if (v1.equals("firefox"))
            {
                try {
                    System.out.println("Opening FireFox...");
                    String s4 = " /usr/bin/firefox";
                    Runtime r4 = Runtime.getRuntime();
                    Process p4= r4.exec(s4);
                } catch (IOException e4) {
                    e4.printStackTrace();
                }

            }

            else if(v1.equals("mindmaster"))
            {
                try {
                    System.out.println("Opening Mindmaster...");
                    String s5 = "/usr/local/bin/mindmaster";
                    Runtime r5 = Runtime.getRuntime();
                    Process p5= r5.exec(s5);
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            else if(v1.equals("a"))
            {
                System.out.println("Program---------------->command");
                System.out.println("********************************");
                System.out.println("Atom text editor-------->'atom'");
                System.out.println("CLion------------------>'clion'");
                System.out.println("IntellijIDEA community------------------>'ij'");
                System.out.println("Wps office writer------------------>'wps'");
                System.out.println("Firefox------------------>'firefox'");
                System.out.println("Mindmaster------------------>'mindmaster");



            }

        }

    }
}
