package com.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.Model.Employee;
import com.rest.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@RequestMapping("/gotoform")
	public String form() {
		return "insert";
	}
	
	@RequestMapping("/add")
	public String addEmpInfo(Employee emp) {
		service.addEmpInfo(emp);
		return "insert";
	}
	
	@RequestMapping("/deletedata")
	public String deleteData() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	public String deleteEmpInfo(@RequestParam("eId") int eId) {
		service.deleteEmpIfo(eId);
		return "delete";
	}
	
	@RequestMapping("/updatedata")
	public String updateData() {
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateEmpInfo(@ModelAttribute Employee emp, @RequestParam("eId") int eId) {
		service.updateEmpInfo(emp, eId);
		return "update";
	}
	 
	@RequestMapping("/getdatabyid")
	public String getSingleData() {
		return "getbyid";
	}
	
	@RequestMapping("/getbyid")
	public String getSingleInfoById(@RequestParam("eId") int id, Model model) {
		Employee emp = service.getSingleDataById(id);
		model.addAttribute("infobyid", emp);
		return "getbyid";
	}
	
	@RequestMapping("/showalldata")
	public String getAllData(Model model,@ModelAttribute Employee emp) {
		List<Employee> list = service.showAll();
		model.addAttribute("showall",list);
		return "getall";
	}
	
}