package com.e.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.e.modals.Supplier;


public interface SupplierService {

	

	
	public Supplier saveSupplier(Supplier supplier);
	//public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int size);
	
	public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int size);
	
}
