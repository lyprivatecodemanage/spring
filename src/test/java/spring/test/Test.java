package spring.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Test {
	/*public static void main(String[] args) {
		System.out.println(get(1));
	}
	public static int get(int x){
		int j=0;
		switch(x){
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
			default:
				j++;
		}
		return j+x;
	}*/
	public static void output(){
		long A1=0;
		long A2=1;
		for(int i=1;i<=50;i++){
			long An;
			if(i==1){
				An=A1;
				System.out.print(An+"\t");
			}else if(i==2){
				An=A2;
				System.out.print(An+"\t");
			}else{
				An=A1+A2;
				A1=A2;
				A2=An;
				System.out.print(An+"\t");
			}
			if(i%5==0){
				System.out.print("\n");
			}
		}
		
	}
	/*public class ArrayListQueue<T> implements Queue<T>{
		List<T> list = new ArrayList<T>();
		void push(T obj){
			list.add(obj);
		}
		T get(){
			return list.get(0);
		}
		T pop(){
			return list.get(0);
		}
		
	}*/
	static class OOMObject{
		protected void finalize(){
			System.out.println("zhixing.....finalize");
		}
	}
	public static void main(String[] args) {
		//isJolly();
		output();
	}
	public static String isJolly(){
		String str = "";
		int total=0;
		int result=0;
		List<Integer> array = new ArrayList<Integer>();
		Set<Integer> resultArray = new HashSet<Integer>();
		List<Integer> inputArray = new ArrayList<Integer>();
		while(true){
			System.out.println("是否输入序列数,否:N,是:Y");
			Scanner sc = new Scanner(System.in);
			String is = sc.nextLine();
			if("N".equals(is)){
				boolean resultFlag = true;
				for(int i=0;i<inputArray.size();i++){
					if(i<inputArray.size()-1){
						result = Math.abs(inputArray.get(i)-inputArray.get(i+1));
						resultArray.add(result);
					}
				}
					for(int j=1;j<array.size()-1;j++){
						resultFlag = resultArray.add(j);
						if(resultFlag){
							str="Not jolly";
							break;
						}
					}
					if(!resultFlag){
						str="jolly";
					}
					break;
			}else{
				System.out.println("请继续输入整数:");
				Scanner sci = new Scanner(System.in);
				int a = sci.nextInt();
				inputArray.add(a);
				total++;
				array.add(total);
			}
		}
		System.out.println("======>"+str);
		return str;
	}
}
