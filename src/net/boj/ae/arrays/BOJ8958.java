package net.boj.ae.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BOJ8958 {
//	"OOXXOXXOOO"?? κ°μ? OX?΄μ¦? κ²°κ³Όκ°? ??€. O? λ¬Έμ λ₯? λ§μ? κ²μ΄κ³?, X? λ¬Έμ λ₯? ??λ¦? κ²μ΄?€. λ¬Έμ λ₯? λ§μ? κ²½μ° κ·? λ¬Έμ ? ? ?? κ·? λ¬Έμ κΉμ? ?°?? O? κ°μκ°? ??€. ?λ₯? ?€?΄, 10λ²? λ¬Έμ ? ? ?? 3?΄ ??€.
//
//	"OOXXOXXOOO"? ? ?? 1+2+0+0+1+0+0+1+2+3 = 10? ?΄?€.
//
//	OX?΄μ¦? κ²°κ³Όκ°? μ£Όμ΄μ‘μ ?, ? ?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		List<Integer> pointList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(new String(br.readLine()));
		}

		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			int point = 0;
			int serial = 0;
			String testCase = iterator.next();
			for(int i = 0; i < testCase.length(); i++) {
				if (testCase.charAt(i) == 'O') {
					serial++;
					point += serial;
				} else {
					serial = 0;
				}
			}
			pointList.add(point);
		}
		
		Iterator<Integer> iterator2 = pointList.iterator();
		
		while (iterator2.hasNext()) {
		System.out.println(iterator2.next());
		}
	}
	
}
