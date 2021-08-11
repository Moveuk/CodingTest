package net.boj.ae.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


public class BOJ10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> al = new ArrayList<>();
        String count = br.readLine();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
			al.add(Integer.parseInt(st.nextToken()));
		}

        int min = al.get(0);
        int max = al.get(0);
        
        for (Integer i : al) {
        	if (i < min) {
        		min = i;
        	}
        	if (i > max) {
				max = i;
			}
        }

        System.out.println(min+" "+max);
	}

}
