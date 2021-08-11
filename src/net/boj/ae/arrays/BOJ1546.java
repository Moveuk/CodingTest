package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1546 {
//	?„¸ì¤??´?Š” ê¸°ë§ê³ ì‚¬ë¥? ë§ì³¤?‹¤. ?„¸ì¤??´?Š” ? ?ˆ˜ë¥? ì¡°ì‘?•´?„œ ì§‘ì— ê°?? ¸ê°?ê¸°ë¡œ ?–ˆ?‹¤. ?¼?‹¨ ?„¸ì¤??´?Š” ?ê¸? ? ?ˆ˜ ì¤‘ì— ìµœëŒ“ê°’ì„ ê³¨ë?‹¤.
//	?´ ê°’ì„ M?´?¼ê³? ?•œ?‹¤. ê·¸ë¦¬ê³? ?‚˜?„œ ëª¨ë“  ? ?ˆ˜ë¥? ? ?ˆ˜/M*100?œ¼ë¡? ê³ ì³¤?‹¤.
//
//	?˜ˆë¥? ?“¤?–´, ?„¸ì¤??´?˜ ìµœê³ ? ?´ 70?´ê³?, ?ˆ˜?•™? ?ˆ˜ê°? 50?´?—ˆ?œ¼ë©? ?ˆ˜?•™? ?ˆ˜?Š” 50/70*100?´ ?˜?–´ 71.43? ?´ ?œ?‹¤.
//
//	?„¸ì¤??´?˜ ?„±? ?„ ?œ„?˜ ë°©ë²•??ë¡? ?ƒˆë¡? ê³„ì‚°?–ˆ?„ ?•Œ, ?ƒˆë¡œìš´ ?‰ê· ì„ êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
//	
//	//?…? ¥
//	ì²«ì§¸ ì¤„ì— ?‹œ?—˜ ë³? ê³¼ëª©?˜ ê°œìˆ˜ N?´ ì£¼ì–´ì§„ë‹¤. ?´ ê°’ì? 1000ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ë‹¤. ?‘˜ì§? ì¤„ì— ?„¸ì¤??´?˜ ?˜„?¬ ?„±? ?´ ì£¼ì–´ì§„ë‹¤. 
//	?´ ê°’ì? 100ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ?Œ?´ ?•„?‹Œ ? •?ˆ˜?´ê³?, ? ?–´?„ ?•˜?‚˜?˜ ê°’ì? 0ë³´ë‹¤ ?¬?‹¤.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Double> list = new ArrayList<>();
		Double max = (double) 0;
		Double total = (double) 0;
		Double avg = (double) 0;
		
		while (st.hasMoreTokens()) {
			Double num = Double.parseDouble(st.nextToken());
			list.add(num);
			total += num;
			if(num > max) {
				max = num;
			}
		}

		avg = total/max*100/n;
				
		System.out.println(avg);
	}

}
