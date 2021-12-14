package controller;

import java.util.logging.Logger;

import entity.cart.Cart;
import entity.cart.CartMedia;
import entity.order.Order;
import entity.order.OrderMedia;

public class PlaceRushOrderController extends PlaceOrderController {

	/**
     * Just for logging purpose
     */
    private static Logger LOGGER = utils.Utils.getLogger(PlaceRushOrderController.class.getName());
    
    
    public PlaceRushOrderController() {
    	super();
    }
    public boolean isSupportRush() {
    	for (Object object : Cart.getCart().getListMedia()) {
    		CartMedia cartMedia = (CartMedia) object;
    		if (cartMedia.getMedia().isSupportRush()) return true;
    	}
    	return false;
    }
    

    public String[] rushProvinces = {"Hà Nội"};
    public boolean validateRushProvince(String province) {
    	String rushProvinceLower = "";
    	String provinceLower = province.toLowerCase();
    	
    	for (int i = 0; i < rushProvinces.length; i++) {
    		rushProvinceLower = rushProvinces[i].toLowerCase();
    		if (provinceLower.equals(rushProvinceLower)) return true;
    	}
    	
    	return false;
    }
    
}
