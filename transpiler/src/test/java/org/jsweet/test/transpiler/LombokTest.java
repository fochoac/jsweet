package org.jsweet.test.transpiler;

import org.junit.Test;

import source.lombok.EqualsAndHashCodeExample;

public class LombokTest extends AbstractTest {

	
	@Test
	public void testEqualsAndHashCode() {
		eval((logHandler, r) -> {
			logHandler.assertNoProblems();
		}, getSourceFile(EqualsAndHashCodeExample.class));
	}
}
