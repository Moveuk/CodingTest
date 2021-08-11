package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2562 {
//	9ê°œì˜ ?„œë¡? ?‹¤ë¥? ??—°?ˆ˜ê°? ì£¼ì–´ì§? ?•Œ, ?´?“¤ ì¤? ìµœëŒ“ê°’ì„ ì°¾ê³  ê·? ìµœëŒ“ê°’ì´ ëª? ë²ˆì§¸ ?ˆ˜?¸ì§?ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
//
//	?˜ˆë¥? ?“¤?–´, ?„œë¡? ?‹¤ë¥? 9ê°œì˜ ??—°?ˆ˜
//
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//
//	?´ ì£¼ì–´ì§?ë©?, ?´?“¤ ì¤? ìµœëŒ“ê°’ì? 85?´ê³?, ?´ ê°’ì? 8ë²ˆì§¸ ?ˆ˜?´?‹¤.
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
