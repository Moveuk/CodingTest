package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3052 {
//	?‘ ??—°?ˆ˜ A?? Bê°? ?ˆ?„ ?•Œ, A%B?Š” Aë¥? Bë¡? ?‚˜?ˆˆ ?‚˜ë¨¸ì? ?´?‹¤. ?˜ˆë¥? ?“¤?–´, 7, 14, 27, 38?„ 3?œ¼ë¡? ?‚˜?ˆˆ ?‚˜ë¨¸ì??Š” 1, 2, 0, 2?´?‹¤. 
//
//	?ˆ˜ 10ê°œë?? ?…? ¥ë°›ì? ?’¤, ?´ë¥? 42ë¡? ?‚˜?ˆˆ ?‚˜ë¨¸ì?ë¥? êµ¬í•œ?‹¤. ê·? ?‹¤?Œ ?„œë¡? ?‹¤ë¥? ê°’ì´ ëª? ê°? ?ˆ?Š”ì§? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] array = new Integer[10];
		for (int n = 0; n < array.length; n++) {
			array[n] = Integer.parseInt(br.readLine());
		}
		
		Set<Integer> set = new HashSet<>();
		for (Integer integer : array) {
			set.add(integer%42);
		}

		System.out.println(set.size());
	}

}
