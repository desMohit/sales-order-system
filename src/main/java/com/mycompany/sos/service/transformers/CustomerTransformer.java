/**
 * 
 */
package com.mycompany.sos.service.transformers;

import java.util.Set;

import com.mycompany.sos.dao.entities.CustomerEntity;
import com.mycompany.sos.model.Customer;

/**
 * CustomerTransformer interface
 * 
 * @author colin
 *
 */
public interface CustomerTransformer {

	Customer getDtoFromEntity(CustomerEntity customerEntity);
	
	CustomerEntity getEntityFromDto(Customer customer);
	
	Set<Customer> getDtoListFromEntityList(Set<CustomerEntity> customerEntity);
}