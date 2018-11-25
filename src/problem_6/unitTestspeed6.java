package problem_6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unitTestspeed6 {
	speed ans = new speed();

	@Test
	void test1() {
		assertEquals(ans.calculate(7.5),1," ");
		
	}
	 void test2() {
		 assertEquals(ans.calculate(1.6),10,"");
	 }
	 void test3() {
		 assertEquals(ans.calculate(0.005),40,"");
	 }

}
