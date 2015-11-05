package com.allen.dynamicprogram;

import java.util.Scanner;
/**
 * @author allen
 * 问题描述：
 * Problem Description
Given a sequence a[1],a[2],a[3]......a[n], your job is to calculate the max sum of a sub-sequence. For example, given (6,-1,5,4,-7), the max sum in this sequence is 6 + (-1) + 5 + 4 = 14.
 

Input
The first line of the input contains an integer T(1<=T<=20) which means the number of test cases. Then T lines follow, each line starts with a number N(1<=N<=100000), then N integers followed(all the integers are between -1000 and 1000).
 

Output
For each test case, you should output two lines. The first line is "Case #:", # means the number of the test case. The second line contains three integers, the Max Sum in the sequence, the start position of the sub-sequence, the end position of the sub-sequence. If there are more than one result, output the first one. Output a blank line between two cases.
 

Sample Input
2
5 6 -1 5 4 -7
7 0 6 -1 1 -6 7 -5
 

Sample Output
Case 1:
14 1 4

Case 2:
7 1 6
 *
 */
public class MaxSum1003 {

	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int k = t;
		//用于控制格式
		boolean flag = true;
		while (k-- > 0) {
			int m = input.nextInt();
			int max = -1002;
			int start = 0;
			int end = 0;
			int sum = 0;
			int s;
			for (int i = 0, j = 0; i < m; i++) {
				s = input.nextInt();
				sum += s;
				if (sum > max) {
					max = sum;
					start = j;
					end = i;
				}
				if (sum < 0) {
					sum = 0;
					j = i + 1;
				}
			}

			if (flag) {
				System.out.println("Case " + (t - k) + ":");
				System.out.println(max + " " + (start + 1) + " " + (end + 1));
				flag = false;
			} else {
				System.out.println();
				System.out.println("Case " + (t - k) + ":");
				System.out.println(max + " " + (start + 1) + " " + (end + 1));
			}
		}
	}
}
