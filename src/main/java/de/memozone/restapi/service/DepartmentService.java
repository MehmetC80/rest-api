package de.memozone.restapi.service;

import de.memozone.restapi.entity.Department;
import de.memozone.restapi.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long deparmentId) throws DepartmentNotFoundException;

   public  void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);



  public  Department fetchDepartmentByName(String departmentName);
}
