package spring.test;

public class Test {
	public static void main(String[] args) {
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
	}
}
