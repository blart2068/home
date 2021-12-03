package blart;

import com.pi4j.io.gpio.*;


public class SMPio {
	
	
	public static void pin(){
		try {
			
			final GpioController gpio = GpioFactory.getInstance();
			final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01,"MyLED",PinState.HIGH);
			
			Thread.sleep(1000);
			pin.low();
			
			gpio.unprovisionPin(pin);
		
			
			
		} catch (Exception e) {
			
		}
		
	}
}
