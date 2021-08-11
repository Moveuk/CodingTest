package net.boj.ad.whileloop;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


public class BOJ10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while (st1.hasMoreTokens()) {
			al1.add(Integer.parseInt(st1.nextToken()));
		}
        while (st2.hasMoreTokens()) {
			al2.add(Integer.parseInt(st2.nextToken()));
		}
        
        for (Integer i : al2) {
        	if (i < al1.get(1)) {
        		al3.add(i);
        	}
        }
        
        Iterator<Integer> iterator = al3.iterator();
        
        while (iterator.hasNext()) {
        	System.out.print(iterator.next()+" ");        	
        }
        
	}

}
