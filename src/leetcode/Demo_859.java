package leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 亲密字符串
 * @author muyou
 *
 */
public class Demo_859 {
	public static void main(String[] args) {
		
	}

	public boolean buddyStrings(String A, String B) {
		if(A.length() != B.length()) return false;
		int num = 0;
		Set<Character> set = new LinkedHashSet<>();
		for(int i = 0;i < A.length();i++) {
			if(A.charAt(i) != B.charAt(i)) {
				num++;
				set.add(A.charAt(i));
				set.add(B.charAt(i));
			}
			if(num > 2) return false;
		}
		if(num == 0) {
			for(int i = 0;i < A.length() -1;i++) for(int j = i + 1;j < A.length();j++) if(A.charAt(i) == A.charAt(j)) return true;
			return false;
		}
		return (num == 2 && set.size() == 2) ? true : false;
	}
}
