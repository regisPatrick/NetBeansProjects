/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;

import java.io.ObjectInputFilter.Status;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class teste {
    
    interface Customer {
	boolean isEnabled();
	Status getStatus();
}

//Map<Status, List<Customer>> groupActiveCustomersByStatus(List<Customer> customers) {
//	return customers.stream()
//			.filter(c -> c.isEnabled())
//			.collect(c -> c.getStatus());
//}
    
}
