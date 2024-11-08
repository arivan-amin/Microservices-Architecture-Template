package com.arivanamin.app.name.backend.employee.application.request;

import com.arivanamin.app.name.backend.employee.core.entity.Employee;
import lombok.*;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmployeeRequest {
    
    String name;
    
    ModelMapper mapper = new ModelMapper();
    
    public Employee toEntity () {
        return mapper.map(this, Employee.class);
    }
}
