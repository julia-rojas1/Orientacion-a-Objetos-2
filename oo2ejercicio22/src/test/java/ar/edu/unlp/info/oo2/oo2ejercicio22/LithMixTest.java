package ar.edu.unlp.info.oo2.oo2ejercicio22;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LithMixTest {
	private ProcessStep ligthMix;
	private MixingTank mixingTankStub;
	
	@BeforeEach
	void setUp() throws Exception {
		ligthMix = new LigthMix();
		mixingTankStub = new MixingTankStub();
	}
	
	@Test
	void testLithMixStub() {
		ligthMix.execute(mixingTankStub);
		assertTrue(ligthMix.isDone());
	}
	
}
