package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2562 {
//	9개의 ?���? ?���? ?��?��?���? 주어�? ?��, ?��?�� �? 최댓값을 찾고 �? 최댓값이 �? 번째 ?��?���?�? 구하?�� ?��로그?��?�� ?��?��?��?��?��.
//
//	?���? ?��?��, ?���? ?���? 9개의 ?��?��?��
//
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//
//	?�� 주어�?�?, ?��?�� �? 최댓값�? 85?���?, ?�� 값�? 8번째 ?��?��?��.
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
