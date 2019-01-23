package chess;



import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

	@Test
	public void testColorWhite() {
		//Scenario
		Color color = Color.WHITE;
		
		
		//Action
		String white = color.toString();
		
		//Validation
		Assert.assertTrue(white.equals("WHITE"));
	}

	@Test
	public void testColorBlack() {
		//Scenario
		Color color = Color.BLACK;
		
		
		//Action
		String black = color.toString();
		
		//Validation
		Assert.assertTrue(black.equals("BLACK"));
	}
	
	
}
