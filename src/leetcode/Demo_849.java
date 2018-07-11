package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 到最近的人的最大距离
 * 
 * @author muyou
 *
 */
public class Demo_849 {
	public int maxDistToClosest(int[] seats) {
		int m = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> listArray = new ArrayList<>();
		for(int n : seats) listArray.add(n);
		for(int i = 0;i < listArray.size();i++) {
			if(i >= 0 && i < listArray.indexOf(1)) {
				list.add(listArray.indexOf(1));
			}else if(i > listArray.indexOf(1) && i < listArray.lastIndexOf(1)) {
				if(seats[i] == 0) {
					m++;
					if(seats[i + 1] == 1) {
						list.add(zd(m));
						m = 0;
					}
				}
			}else {
				list.add(listArray.size() - 1 - listArray.lastIndexOf(1));
			}
		}
		Collections.sort(list);
		return list.get(list.size() - 1);
	}
	
	private static int zd(int num) {
		if(num % 2 == 0) {
			return num / 2;
		}else {
			return (num + 1) / 2;
		}
	}
	
	public static void main(String[] args) {
		Demo_849 demo = new Demo_849();
		int[] nnn = {1,0};
		System.out.println(demo.maxDistToClosest(nnn));
	}
}
