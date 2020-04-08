package jenkins.model;

import jenkins.model.IdStrategy;
import static org.junit.Assert.*;
import org.junit.Test;

public class IdFromFileNameTest {
	//@Rule public JenkinsRule j = new JenkinsRule();

	@Test public void test1() {
		
		IdStrategy ids = new IdStrategy.CaseSensitive();
		String filename = "$123";
		assertEquals("",ids.idFromFilename(filename));
	}

	@Test public void test2() {
		IdStrategy ids = new IdStrategy.CaseSensitive();
		String filename = "$12";
		assertEquals("",ids.idFromFilename(filename));

	}
}
