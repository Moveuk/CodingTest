package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2562 {
//	9κ°μ ?λ‘? ?€λ₯? ??°?κ°? μ£Όμ΄μ§? ?, ?΄?€ μ€? μ΅λκ°μ μ°Ύκ³  κ·? μ΅λκ°μ΄ λͺ? λ²μ§Έ ??Έμ§?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
//
//	?λ₯? ?€?΄, ?λ‘? ?€λ₯? 9κ°μ ??°?
//
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//
//	?΄ μ£Όμ΄μ§?λ©?, ?΄?€ μ€? μ΅λκ°μ? 85?΄κ³?, ?΄ κ°μ? 8λ²μ§Έ ??΄?€.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> al = new ArrayList<>();
		int order = 0;
		int max = 0;
		Integer num = 0;

		while (true) {
			if (al.size() == 9) {
				order = al.indexOf(max);
				break;
			}
			num = Integer.parseInt(br.readLine());
			al.add(num);
			if (num > max) {
				max = num;
			}
		}

		System.out.println(max);
		System.out.println(order+1);
	}

}
