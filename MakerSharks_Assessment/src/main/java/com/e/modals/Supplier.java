package com.e.modals;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Supplier {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long supplierId;
	    private String companyName;
	    private String website;
	    private String location;
	    private String natureOfBusiness;
	    @ElementCollection
	    private List<String> manufacturingProcesses;
}
