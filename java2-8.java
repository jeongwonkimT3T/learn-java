
public class java1 {

	public static void main(String[] args) {
		
		// 자바의 정석 2-8 연습문제 풀이
		
		int x = 1, y = 2, z = 3;
		int tmp;
		
		
		tmp = y;   // tmp에 y에 저장된 값 2를 대입
		y = z;     // y에 z에 저장된 값 3을 저장 (2 -> 3)
		z = tmp;   // z에 tmp에 저장된 2를 대입 (3 -> 2)
		tmp = x;   // tmp에 x에 저장된 값 1을 대입 (2 -> 1)
		x= z;      // x에 z에 저장된 값 2를 대입 (1 -> 2)
		z= tmp;    // z에 tmp에 저장된 값 1을 대입 (2 -> 1)
		 
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);

	}

}
