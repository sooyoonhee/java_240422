package chaper02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x=3;
		int y=5;
		System.out.println("x:" + x+",y:" + y);
		
//		x 값을 임시 저장
		int temp=x;
		x=y;
//		임시 값을 y에 저장
		y=temp;
		System.out.println("x:" + x+",y:" + y);
		System.out.println(x+y);
		System.out.println(x+" "+y);
		System.out.println(x+y+" q ");
		
	}
}
