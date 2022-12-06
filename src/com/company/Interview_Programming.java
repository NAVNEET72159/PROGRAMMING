package com.company;

import java.io.*;

public class Interview_Programming {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i=0; t_i<T; t_i++) {
                int N = Integer.parseInt(br.readLine().trim());

                String out_ = Solve(N);
                System.out.println(out_);
            }

            wr.close();
            br.close();
        }
        static String Solve(int N){
            // Write your code here
            int sum = 0;
            String res = " ";
            for (int i = 1;i<N;i++)
            {
                if (N%i==0)
                {
                    sum = sum+i;
                }
            }
            if(sum == N)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

            return res;
        }
}
