package postmanmethods;
import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;


public class postmethod {
	@Test
	public Karate runTest()
	{
		return Karate.run("post").relativeTo(getClass());
	}

}



