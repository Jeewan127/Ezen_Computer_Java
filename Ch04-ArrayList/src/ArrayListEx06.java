import java.util.Scanner;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*
	 	1. 사용자에게 맵의 사이즈를 입력 받는다.
	 	2. 입력한 사이즈 크기만큼의 맵배열을 생성한다.
	 	3. 배열에 차례로 0~2까지의 값을 랜덤하게 입력한다.
	 	4. 배열의 값에 따라 화면에 맵을 출력한다.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("맵크기 입력: ");
		int map = sc.nextInt();
		
		int [] num = new int[map];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3);
				if(num[i] == 0) {
					System.out.print("#");
				} else if(num[i] == 1) {
					System.out.print("0");
				} else if(num[i] == 2) {
					System.out.print("X");
				}
			}		
	}
}
