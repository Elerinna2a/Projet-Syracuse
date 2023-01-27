import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

///mnt/c/Users/abell/desktop/Aflokkat/Algo avancé/td/td1/untitled/src

public class Syracuse {
    public static void main(String[] args) {

        try {
            String n = args[0];
            int x = Integer.parseInt(n);
            FileWriter fw=new FileWriter("f"+n+".dat");
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write("n Un");
            bw.newLine();
            syracurse2(x,0,0,bw);
//            syracuse(0,15, bw);
//            tempVol(15, bw);
            bw.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }
    static int collatz(int x) {
        if ( x % 2 == 0 ) {
            return x / 2;
        } else {
            return 3*x +1;
        }
    }

    static void syracurse2(int x, int cpt, int max, BufferedWriter bw) throws IOException {
        if (x > max) {
            max = x;
        }
        if (x == 1) {
            bw.write(cpt + " " + x);
            bw.newLine();
            bw.write("Altitude max=" + max);
            bw.newLine();
            bw.write("temps de vol=" + cpt);
            bw.newLine();
            return;
        } else {
            bw.write(cpt + " " + x);
            bw.newLine();
            syracurse2(collatz(x), cpt + 1, max, bw);
        }
    }

//    static boolean syracuse(int i, int y, BufferedWriter bw) throws IOException {
////        int i = 0;
//        bw.write(Integer.toString(i) + " " + Integer.toString(y));
//        while (y !=1) {
//            i++;
//            bw.newLine();
//            y = collatz(y);
//            bw.write(Integer.toString(i) + " " + Integer.toString(y));
//        }
//        return false;
//    }
//
//
//    static boolean tempVol(int z, BufferedWriter bw) throws IOException {
//        int cpt = 0;
//        int i = 0;
//        while ( z != 1) {
//            cpt++;
//            z = collatz(z);
//            if ( i < z) {
//                i = z;
//            }
//        }
//        bw.newLine();
//        bw.write("Altitude max = " + Integer.toString(i));
//        bw.newLine();
//        bw.write("temps de vol = " + Integer.toString(cpt));
//        return false;
//    }

}
