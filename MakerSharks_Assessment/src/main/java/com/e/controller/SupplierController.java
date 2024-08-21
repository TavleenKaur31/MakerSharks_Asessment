package com.e.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e.modals.Supplier;
import com.e.modals.SupplierQueryDTO;
import com.e.service.SupplierService;

@Controller
@RequestMapping("/api/supplier")
public class SupplierController {
	
	  @Autowired
	    private SupplierService supplierService;

	    @PostMapping("/save")
	    public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier supplier) {
	        Supplier savedSupplier = supplierService.saveSupplier(supplier);
	        return ResponseEntity.ok(savedSupplier);
	    }
	
	

	    
	    @PostMapping("/query")
	    public ResponseEntity<List<Supplier>> querySuppliers(
	        @RequestBody SupplierQueryDTO supplierQueryDTO) {
	        
	        List<Supplier> suppliers = supplierService.searchSuppliers(
	            supplierQueryDTO.getLocation(),
	            supplierQueryDTO.getNatureOfBusiness(),
	            supplierQueryDTO.getManufacturingProcess(),
	            supplierQueryDTO.getSize()
	        );
	        return ResponseEntity.ok(suppliers);
	    }
	    

}
