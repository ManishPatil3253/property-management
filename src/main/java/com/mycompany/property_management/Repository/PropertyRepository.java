package com.mycompany.property_management.Repository;

import com.mycompany.property_management.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository  extends CrudRepository<PropertyEntity, Long> {

}
