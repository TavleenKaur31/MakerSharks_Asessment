package com.e.modals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SupplierQueryDTO {

	    private String location;
	    private String natureOfBusiness;
	    private String manufacturingProcess;
	    private int size;
}
