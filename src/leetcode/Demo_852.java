package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 山脉数组的峰顶索引
 * 
 * @author muyou
 *
 */
public class Demo_852 {
	
	// 第一种 循环替换获取最大值     LeetCode提交执行用时24ms
	public int peakIndexInMountainArray(int[] A) {
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < A.length;i++){
            list.add(A[i]);
            if(A[i] > num) num = A[i];
        }
        return list.indexOf(num);
    }
	
	// 第二种 排序获取最大值  LeetCode提交执行用时17ms
	public int peakIndexInMountainArray2(int[] A) {
        List<Integer> list = new ArrayList<>();
        for(int n : A) list.add(n);
        Arrays.sort(A);
        return list.indexOf(A[A.length - 1]);
    }
}
