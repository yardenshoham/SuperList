package controller;

import bl.Product;
import bl.SuperList;
import listeners.*;

public class ProductController implements ListEventsListener, ListUIEventsListener {
	private SuperList listBL;
//	private AbstractSuperListView listUI;
	
	@Override
	public void addProductToUI(String name, String brand, String notes, String units) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProductFromUI(String name, String brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addedProductToModelEvent(Product addedProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removedProductFromModelEvent(Product deletedProduct) {
		// TODO Auto-generated method stub
		
	}

}