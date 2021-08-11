package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2577 {
//	?„¸ ê°œì˜ ??—°?ˆ˜ A, B, Cê°? ì£¼ì–´ì§? ?•Œ A Ã— B Ã— Cë¥? ê³„ì‚°?•œ ê²°ê³¼?— 0ë¶??„° 9ê¹Œì? ê°ê°?˜ ?ˆ«?ê°? ëª? ë²ˆì”© ?“°???Š”ì§?ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
//
//	?˜ˆë¥? ?“¤?–´ A = 150, B = 266, C = 427 ?´?¼ë©? A Ã— B Ã— C = 150 Ã— 266 Ã— 427 = 17037300 ?´ ?˜ê³?, ê³„ì‚°?•œ ê²°ê³¼ 17037300 ?—?Š” 0?´ 3ë²?, 1?´ 1ë²?, 3?´ 2ë²?, 7?´ 2ë²? ?“°???‹¤.
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
