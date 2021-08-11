package net.boj.ae.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BOJ8958 {
//	"OOXXOXXOOO"?? ê°™ì? OX?´ì¦ˆ?˜ ê²°ê³¼ê°? ?ˆ?‹¤. O?Š” ë¬¸ì œë¥? ë§ì? ê²ƒì´ê³?, X?Š” ë¬¸ì œë¥? ??ë¦? ê²ƒì´?‹¤. ë¬¸ì œë¥? ë§ì? ê²½ìš° ê·? ë¬¸ì œ?˜ ? ?ˆ˜?Š” ê·? ë¬¸ì œê¹Œì? ?—°?†?œ O?˜ ê°œìˆ˜ê°? ?œ?‹¤. ?˜ˆë¥? ?“¤?–´, 10ë²? ë¬¸ì œ?˜ ? ?ˆ˜?Š” 3?´ ?œ?‹¤.
//
//	"OOXXOXXOOO"?˜ ? ?ˆ˜?Š” 1+2+0+0+1+0+0+1+2+3 = 10? ?´?‹¤.
//
//	OX?´ì¦ˆ?˜ ê²°ê³¼ê°? ì£¼ì–´ì¡Œì„ ?•Œ, ? ?ˆ˜ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.	
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
