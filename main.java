import java.io.*;
import java.util.*;

public class main {

    public static void main(String argv[]) {
        // expected output: imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
        String s1 = "if man was meant to stay on the ground god would have given us roots";
        System.out.println(encryption(s1));
        System.out.println("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau");
        System.out.println();

        // expected output: hae and via ecy
        String s2 = "haveaniceday";
        System.out.println(encryption(s2));
        System.out.println("hae and via ecy");
        System.out.println();

        // expected output: fto ehg ee dd
        String s3 = "feedthedog";
        System.out.println(encryption(s3));
        System.out.println("fto ehg ee dd");
        System.out.println();

        // expected output: clu hlt io
        String s4 = "chillout";
        System.out.println(encryption(s4));
        System.out.println("clu hlt io");
        System.out.println();
    }

    public static String encryption(String s) {
        if(s == null || s.length() < 1) return null;
        s = s.replaceAll("\\s", "");
        int n = s.length();
        int rows = (int)Math.floor(Math.sqrt(n)), cols = (int)Math.ceil(Math.sqrt(n));
        if(rows * cols < n) rows ++;

        StringBuilder sb = new StringBuilder();

        for(int c = 0; c < cols; c ++) {
            for(int r = 0; r < rows; r ++) {
                int i = r * cols + c;
                if(i < n) sb.append(s.charAt(i));
            }
            sb.append(" ");
        }

//        System.out.println(sb.toString());
//        System.out.println(n + ", " + rows + ", " + cols);
        return sb.toString();
    }
}
