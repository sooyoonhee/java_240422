package chaper02;

public class ByteOperationExample {
	public static void main(String[] args) {
//		연산식을 변수로 저장
		byte result1=10+20;
		System.out.println(result1);

		byte x = 10;
		byte y = 20;
//		연산 결과가 int로 자동 변환되어서 byte로 casting 해야 함.
		byte result2 =(byte) (x+y);
		
		System.out.println(result2);
	}
}
