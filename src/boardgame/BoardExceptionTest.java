package boardgame;



import org.junit.Assert;
import org.junit.Test;

public class BoardExceptionTest {

	@Test
	public void test() {
		//Scenario
		BoardException boardException = new BoardException("Only Testing");
		
		//Action 
		String msg = boardException.getMessage();
		
		//Validation
		Assert.assertEquals("Only Testing", msg);
		

	}

}
