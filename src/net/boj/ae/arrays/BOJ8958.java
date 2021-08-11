package net.boj.ae.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BOJ8958 {
//	"OOXXOXXOOO"?? 같�? OX?�즈?�� 결과�? ?��?��. O?�� 문제�? 맞�? 것이�?, X?�� 문제�? ??�? 것이?��. 문제�? 맞�? 경우 �? 문제?�� ?��?��?�� �? 문제까�? ?��?��?�� O?�� 개수�? ?��?��. ?���? ?��?��, 10�? 문제?�� ?��?��?�� 3?�� ?��?��.
//
//	"OOXXOXXOOO"?�� ?��?��?�� 1+2+0+0+1+0+0+1+2+3 = 10?��?��?��.
//
//	OX?�즈?�� 결과�? 주어졌을 ?��, ?��?���? 구하?�� ?��로그?��?�� ?��?��?��?��?��.	
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
