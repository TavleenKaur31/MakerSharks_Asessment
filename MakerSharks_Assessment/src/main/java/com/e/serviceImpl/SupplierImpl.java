package com.e.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.e.Repository.SupplierRepository;
import com.e.modals.Supplier;
import com.e.service.SupplierService;


@Service
public class SupplierImpl  implements SupplierService{

	
	@Autowired
	private SupplierRepository repo;
	
	@Override
	public Supplier saveSupplier(Supplier supplier) {
		
		return repo.save(supplier);
	}

	

	
	public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int size) {
        Pageable pageable = PageRequest.of(0, size);
        List<Supplier> supp = repo.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location,                    natureOfBusiness, manufacturingProcess, pageable);
		return supp;
    }
	
	
	
	
	
	
}
