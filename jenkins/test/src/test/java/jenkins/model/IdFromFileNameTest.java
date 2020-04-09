package jenkins.model;

import jenkins.model.IdStrategy;
import hudson.model.User;
import static org.junit.Assert.*;
import org.junit.Test;

public class IdFromFileNameTest {
	//@Rule public JenkinsRule j = new JenkinsRule();

	@Test public void test1() {
		//User user = User.get("john smith");
		//User user2 = User.get("John Smith");
		IdStrategy ids = new IdStrategy.CaseSensitive();
		String filename = "$0031";
		assertEquals("1",ids.idFromFilename(filename));
		//assertEquals(user.getId(),User.idStrategy().idFromFilename(User.idStrategy().filenameOf(user.getId())));
	}

	@Test public void testBreak() {
		IdStrategy ids = new IdStrategy.CaseSensitive();
		String filename = "$12";
		assertEquals("",ids.idFromFilename(filename));

	}
}
