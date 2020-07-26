package constructioncost;

import static org.junit.Assert.*;
import org.junit.*;
public class ConstructionCostTest{

	MaterialsRequired mr;
	@Before
	public void objectCreation()
	{
		mr=new MaterialsRequired();
	}
	@Test
	public void test() throws Exception {
		assertEquals("1297200.0INR",mr.calculateHouseConstructionCost("standard",1081.00,"not automated"));
	}
	@Test
	public void test1() throws Exception {
		assertEquals("1200000.0INR",mr.calculateHouseConstructionCost("above standard",800.00,"not automated"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals("1987500.0INR",mr.calculateHouseConstructionCost("high standard",795.00,"fully automated"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals("2700000.0INR",mr.calculateHouseConstructionCost("high standard",1500.00,"not automated"));
	}
	
}