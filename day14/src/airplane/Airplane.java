package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();		
	Human[] arr = new Human[5];
	
	public int entrance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				System.out.println(c.name + " 탑승 완료");
				return 1;
			}
		}		
		System.out.println(c.name + " 탑승 불가");
		return 0;
	}

	public int emergency() {
		int index;
		int cnt = 0;
		do {
			index = ran.nextInt(arr.length);
			if(cnt > 100) {
				System.out.println("탑승객이 없습니다");
				return -1;
			}
			cnt++;
		} while(arr[index] == null);
		
		System.out.println(arr[index].name + " 고객이 급체했습니다");
		return index;
	}
	
	public void search_heal(int index) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i] instanceof Doctor && arr[i] != arr[index]) {
				Doctor d = (Doctor)arr[i];
				d.heal(arr[index]);
				break;
			}
			else {
				System.out.println("치료 가능한 대상이 없습니다");
			}
		}
		
	}
	
	
}
