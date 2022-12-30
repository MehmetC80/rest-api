package de.memozone.restapi.controller;

import de.memozone.restapi.entity.Department;
import de.memozone.restapi.error.DepartmentNotFoundException;
import de.memozone.restapi.service.DepartmentService;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {

        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long deparmentId) throws DepartmentNotFoundException {

        LOGGER.info("Inside fetchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentById(deparmentId);

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {

        departmentService.deleteDepartmentById(departmentId);
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        return "Department deleted successfully !!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {


        return departmentService.updateDepartment(departmentId, department);

    }

    @GetMapping("/departments/departmentName/{departmentName}")
    public Department fetchDepartmentByName(@PathVariable("departmentName") String departmentName) {

        return departmentService.fetchDepartmentByName(departmentName);
    }

}
