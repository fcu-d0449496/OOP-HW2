package fcu.iecs.oop;

public class Continue {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;
		for(i = 0; i < 5; i ++) {
			if(i==0||i==2||i>3)
				continue;
			System.out.println(i);
			}
	}
}
