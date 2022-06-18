package postmanmethods;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class getmethod {
	@Test
	public Karate runTest()
	{
		return Karate.run("getall").relativeTo(getClass());
	}

}



