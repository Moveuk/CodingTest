package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2577 {
//	?�� 개의 ?��?��?�� A, B, C�? 주어�? ?�� A × B × C�? 계산?�� 결과?�� 0�??�� 9까�? 각각?�� ?��?���? �? 번씩 ?��???���?�? 구하?�� ?��로그?��?�� ?��?��?��?��?��.
//
//	?���? ?��?�� A = 150, B = 266, C = 427 ?��?���? A × B × C = 150 × 266 × 427 = 17037300 ?�� ?���?, 계산?�� 결과 17037300 ?��?�� 0?�� 3�?, 1?�� 1�?, 3?�� 2�?, 7?�� 2�? ?��???��.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int multiply = A * B * C;
		int remainder = 0;
		int i = 0;

		int[] arrayInt = new int[10];
		
		while (multiply != 0) {
			remainder = multiply%10;
			arrayInt[remainder] += 1;
			multiply = multiply/10;
		}

		while (i < (arrayInt.length)) {
			System.out.println(arrayInt[i]);
			i++;
		}
	}

}
