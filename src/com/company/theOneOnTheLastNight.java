package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException
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

public class theOneOnTheLastNight {
    static Reader sc = new Reader();
    public static void main(String args[]) throws IOException {
        int T = sc.nextInt();

        while (T != 0) {
            T--;
            int N = sc.nextInt();
            int K = sc.nextInt();

            theOneOnTheLastNight obj = new theOneOnTheLastNight();
            int arr[] = obj.makeArray(N);

            while (K != 0) {
                int index = obj.findSmallestIndex(arr);
                arr[index] = arr[index] + 1 < 10 ? arr[index] + 1 : arr[index];
                K--;
            }
            int result = obj.maxPossibleValue(arr);
            System.out.println(result);
        }
    }

    public int[] makeArray(int N) {
        int d = 0, temp = N;
        while (temp>0) {
            temp = temp/10;
            d++;
        }

        int a[] = new int[d];
        for (int i = 0; i < d; i++) {
            a[i] = N%10;
            N = N/10;
        }
        return a;
    }

    public int findSmallestIndex(int[] a) {
        int t = a[0], index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < t) {
                t = a[i];
                index = i;
            }
        }
        return index;
    }


    public int maxPossibleValue(int a[]) {

        int maxValue = 1;
        for (int i = 0; i < a.length; i++) {
            maxValue = maxValue*a[i];
        }
        return maxValue;
    }
}
