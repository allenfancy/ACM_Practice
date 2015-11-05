package com.allen.dynamicprogram;

import java.util.Scanner;

public class ACM1029 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n,num,res= 0;
		int  flag = 0;
		while(sc.hasNextLong()){
			n = sc.nextLong();
			for(int i =0 ;i <n;i++){
				num = sc.nextLong();
				if(0 == flag){
					flag = 1;
					res = num;
				}else{
					if(res==num){
						flag ++;
					}else{
						flag --;
					}
				}
			}
			System.out.println(res);
		}
	}
}
