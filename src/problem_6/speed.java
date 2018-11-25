package problem_6;

import java.util.Scanner;

public class speed {
	

	public static int calculate(double m) {
		Scanner in = new Scanner(System.in);
		int v[] = {1,10,20,40};
		double T = 60.0;
		int r = 3;
		int ans = 0;
		
		for(int i =0;i<4;i++) {
			double mt=m*(v[i]*v[i])*r;
			if(mt<=T && ans<v[i]) {
				ans = v[i];
			}
		}
		
		
		System.out.println("The greated speed is :" +ans);
		return ans;

	}

}
