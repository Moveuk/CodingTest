package net.boj.ae.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3052 {
//	? ??°? A?? Bκ°? ?? ?, A%B? Aλ₯? Bλ‘? ?? ?λ¨Έμ? ?΄?€. ?λ₯? ?€?΄, 7, 14, 27, 38? 3?Όλ‘? ?? ?λ¨Έμ?? 1, 2, 0, 2?΄?€. 
//
//	? 10κ°λ?? ?? ₯λ°μ? ?€, ?΄λ₯? 42λ‘? ?? ?λ¨Έμ?λ₯? κ΅¬ν?€. κ·? ?€? ?λ‘? ?€λ₯? κ°μ΄ λͺ? κ°? ??μ§? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±???€.
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
