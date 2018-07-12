package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文数
 * 
 * @author muyou
 *
 */
public class Demo_9 {
	
	// 第一种方法 将整数转换为字符串
	public boolean isPalindrome(int x) {
		return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
	}
	
	// 第二种方法 不转换 的 情况下解决
	public boolean isPalindrome2(int x) {
		int n = x;
		int m = 0;
		if(x == Math.pow(2, 31) - 1) return false;
		List<Integer> list = new ArrayList<>();
		while(x > 0) {
			list.add(x % 10);
			x /= 10;
		}
		for(int i = 0;i < list.size();i++) m += list.get(i) * Math.pow(10, list.size() - i - 1);
		return m == n;
	}
	
	public static void main(String[] args) {
		System.out.println(new Demo_9().isPalindrome(-121));
		System.out.println(new Demo_9().isPalindrome2(2147483647));
	}
}
