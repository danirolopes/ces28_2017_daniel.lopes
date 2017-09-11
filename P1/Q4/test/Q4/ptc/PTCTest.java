package Q4.ptc;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PTCTest {
	
	private ControladorPTC ptc;
	@Mock Sensor mockedSensor;
	@Mock Datacenter mockedCenter;
	@Mock PainelCondutor mockedCond;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks();
		
		mockedSensor = mock(Sensor.class);
		mockedCenter = mock(Datacenter.class);
		mockedCond = mock(PainelCondutor.class);
		ptc = new ControladorPTC(mockedSensor, mockedCenter, mockedCond);
	}

}
