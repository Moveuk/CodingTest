package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1546 {
//	?Έμ€??΄? κΈ°λ§κ³ μ¬λ₯? λ§μ³€?€. ?Έμ€??΄? ? ?λ₯? μ‘°μ?΄? μ§μ κ°?? Έκ°?κΈ°λ‘ ??€. ?Ό?¨ ?Έμ€??΄? ?κΈ? ? ? μ€μ μ΅λκ°μ κ³¨λ?€.
//	?΄ κ°μ M?΄?Όκ³? ??€. κ·Έλ¦¬κ³? ?? λͺ¨λ  ? ?λ₯? ? ?/M*100?Όλ‘? κ³ μ³€?€.
//
//	?λ₯? ?€?΄, ?Έμ€??΄? μ΅κ³ ? ?΄ 70?΄κ³?, ??? ?κ°? 50?΄??Όλ©? ??? ?? 50/70*100?΄ ??΄ 71.43? ?΄ ??€.
//
//	?Έμ€??΄? ?±? ? ?? λ°©λ²??λ‘? ?λ‘? κ³μ°?? ?, ?λ‘μ΄ ?κ· μ κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
//	
//	//?? ₯
//	μ²«μ§Έ μ€μ ?? λ³? κ³Όλͺ©? κ°μ N?΄ μ£Όμ΄μ§λ€. ?΄ κ°μ? 1000λ³΄λ€ ?κ±°λ κ°λ€. ?μ§? μ€μ ?Έμ€??΄? ??¬ ?±? ?΄ μ£Όμ΄μ§λ€. 
//	?΄ κ°μ? 100λ³΄λ€ ?κ±°λ κ°μ? ??΄ ?? ? ??΄κ³?, ? ?΄? ??? κ°μ? 0λ³΄λ€ ?¬?€.
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
