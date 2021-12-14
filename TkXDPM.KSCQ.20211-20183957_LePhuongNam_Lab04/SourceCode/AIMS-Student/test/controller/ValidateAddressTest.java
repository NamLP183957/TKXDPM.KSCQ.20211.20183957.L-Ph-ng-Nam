package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateAddressTest {
	
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Hai ba trung Noi noi, true",
		"666 ***, false"
	})
	void testValidateAddress(String address, boolean expected) {
		boolean isValid = placeOrderController.validateAddress(address);
		assertEquals(expected, isValid);
	}

}
