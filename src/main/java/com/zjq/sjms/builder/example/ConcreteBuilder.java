package com.zjq.sjms.builder.example;

public class ConcreteBuilder implements Builder{

	private Product resultProduct;
	
	public Product getProduct() {
		return resultProduct;
	}
	@Override
	public void buildPart() {
		
	}

}
