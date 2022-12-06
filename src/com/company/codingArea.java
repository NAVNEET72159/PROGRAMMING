package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class FASTIO {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public FASTIO()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public FASTIO(String file_name) throws IOException
    {
        din = new DataInputStream(
                new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException
    {
        byte[] buf = new byte[64];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') {
                if (cnt != 0) {
                    break;
                }
                else {
                    continue;
                }
            }
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0,
                BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}

public class codingArea{
    public static void main(String args[]) throws IOException {
        FASTIO fastio = new FASTIO();
        codingArea obj = new codingArea();

        int r1 = fastio.nextInt();
        int r2 = fastio.nextInt();
        int s1 = fastio.nextInt();
        int s2 = fastio.nextInt();
        int t = fastio.nextInt();
        int d = fastio.nextInt();

        double circumference_of_circle_1 = 2*3.141592653589793*r1;
        double circumference_of_circle_2 = 2*3.141592653589793*r2;

        double time_for_first_Circle_Revolution = circumference_of_circle_1/s1;
        double time_for_second_Circle_Revolution = circumference_of_circle_2/s2;

        int no_of_revolution_M1 = (int) (t/time_for_first_Circle_Revolution);
        int no_of_revolution_M2 = (int) (t/time_for_second_Circle_Revolution);

        System.out.print(no_of_revolution_M1+" "+no_of_revolution_M2);
        System.out.println();

        int time1[] = new int[no_of_revolution_M1];
        int time2[] = new int[no_of_revolution_M2];

        if (d>=r1+r2) {
            System.out.print("no crash");
        } else {
            int sum1 = 0;
            for (int i = 0; i < no_of_revolution_M1; i++) {
                time1[i] = (int) (sum1+time_for_first_Circle_Revolution);
                sum1 = (int) (sum1+time_for_first_Circle_Revolution);
                System.out.print(time1[i]+" ");
            }
            System.out.println();
            int sum2 = 0;
            for (int i = 0; i < no_of_revolution_M2; i++) {
                time2[i] = (int) (sum2+time_for_second_Circle_Revolution);
                sum2 = (int) (sum2+time_for_second_Circle_Revolution);
                System.out.print(time2[i]+" ");
            }
            System.out.println();

            int lengthOfCord = obj.lengthOfCord(r1, r2, d);
            int distance_Between = d-((d-r1)+(d-r2));

            int base1 = obj.calculateBase(lengthOfCord/2);
            int base2 = obj.calculateBase(lengthOfCord/2);

            System.out.println(base1+" "+base2);

            double angle1 = obj.calculateAngle(r1, d-r2+base1);
            double angle2 = obj.calculateAngle(r2, d-r1+base2);

            System.out.println(angle1+" "+angle2);
        }
    }
    public int lengthOfCord(int r1, int r2, int d) {
        int length_of_cord = ((r1*r2)/d)*2;
        return length_of_cord;
    }
    public int calculateBase(int lengthOfCord) {
        int base = (int) -(lengthOfCord/Math.tan(90));
        return base;
    }
    public double calculateAngle(int r1, int base) {
        double angle = 0.0;
        return angle;
    }
}
