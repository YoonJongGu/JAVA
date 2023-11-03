package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		Human d1 = new Doctor("의사1");
		Human d2 = new Doctor("의사2");
		Human d3 = new Doctor("의사3");
		Human s1 = new Singer("가수1");
		Human s2 = new Singer("가수2");
		Human s3 = new Singer("가수3");
		
		air.entrance(d1);
		air.entrance(d2);
		air.entrance(d3);
		air.entrance(s1);
		air.entrance(s2);
		air.entrance(s3);
		int index = air.emergency();
		air.search_heal(air.emergency());
		
		
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		for(int i = 0; i < air.arr.length; i++) {
			if(air.arr[i] != null && air.arr[i] instanceof Doctor && air.arr[index] != air.arr[i]) {				
				Doctor d = (Doctor)air.arr[i];				
				d.heal(air.arr[index]);
				break;
			}
			else {
				System.out.println("치료 가능한 대상이 없습니다");
			}
		}
	}
}
