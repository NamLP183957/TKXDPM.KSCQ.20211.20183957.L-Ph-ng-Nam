package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateRushProvinceTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Hà nội, true",
		"Hà Nội, true",
		"Sài gòn***s, false",
		"HÀ NỘI, true"		
	})
	void testValidateRushProvince(String province, boolean expected) {
		boolean isValid = placeRushOrderController.validateRushProvince(province);
		assertEquals(expected, isValid);
	}

}
