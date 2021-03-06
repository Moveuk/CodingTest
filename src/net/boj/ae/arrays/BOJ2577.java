package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2577 {
//	?Έ κ°μ ??°? A, B, Cκ°? μ£Όμ΄μ§? ? A Γ B Γ Cλ₯? κ³μ°? κ²°κ³Ό? 0λΆ??° 9κΉμ? κ°κ°? ?«?κ°? λͺ? λ²μ© ?°???μ§?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
//
//	?λ₯? ?€?΄ A = 150, B = 266, C = 427 ?΄?Όλ©? A Γ B Γ C = 150 Γ 266 Γ 427 = 17037300 ?΄ ?κ³?, κ³μ°? κ²°κ³Ό 17037300 ?? 0?΄ 3λ²?, 1?΄ 1λ²?, 3?΄ 2λ²?, 7?΄ 2λ²? ?°???€.
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
