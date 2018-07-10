package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 柠檬水找零
 * 
 * @author muyou
 *
 */
public class Demo_860 {
	private static final Integer UNITPRICE = 5;
	private static final Integer DENOMINATION1 = 5;
	private static final Integer DENOMINATION2 = 10;

	public static boolean lemonadeChange(int[] bills) {
		if(bills.length == 0) return true;
		List<Integer> profit = new ArrayList<>();
		for(int i = 0; i < bills.length;i++) {
			profit.add(bills[i]);
			int num = bills[i] - UNITPRICE;
			if(num == 5) {
				if(profit.contains(5)) {
					profit.remove(DENOMINATION1);
				}else {
					return false;
				}
			}else if(num == 15) {
				if((profit.contains(10) && !profit.contains(5)) || (!profit.contains(10) && ys(profit, 5) < 3)) return false;
				if(profit.contains(10) && profit.contains(5)) {
					profit.remove(DENOMINATION2);
					profit.remove(DENOMINATION1);
				}else if(!profit.contains(10) && ys(profit, 5) >= 3) {
					profit.remove(DENOMINATION1);
					profit.remove(DENOMINATION1);
					profit.remove(DENOMINATION1);
				}
			}
		}
		return true;
	}
	
	private static int ys(List<Integer> profit,Integer n) {
		int num = 0;
		for(Integer m : profit) {
			if(m == n) num++;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] bills = {5,5,5,5,10,5,20,10,5,5};
		System.out.println(Arrays.toString(bills));
		System.out.println(lemonadeChange(bills));
	}
}
