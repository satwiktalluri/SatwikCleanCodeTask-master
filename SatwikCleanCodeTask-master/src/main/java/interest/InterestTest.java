package interest;
import static org.junit.Assert.*;
import org.junit.*;
public class InterestTest{

	Interest interest;
	@Before
	public void objectCreation()
	{
		interest=new Interest();
	}
	@Test
	public void test(){
		assertEquals("40.0Rs/-",interest.getSimpleInterest(500.00,4.0,2.0));
	}
	@Test
	public void test1(){
		assertEquals("81.60000000000014Rs/-",interest.getCompoundInterest(1000.00,4.0,2.0));
	}

}