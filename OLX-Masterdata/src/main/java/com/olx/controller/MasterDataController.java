package com.olx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.Category;
import com.olx.dto.Status;
import com.olx.service.MasterDataService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("olx")
public class MasterDataController {
	
	@Autowired
	MasterDataService masterDataService;
	@GetMapping(value="/advertise/category",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	 @ApiOperation(value="Get All Category")
	public List<Category> getAllCategories(){
		return masterDataService.getAllCategories();
	}
	@GetMapping(value="/advertise/",
			produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	 @ApiOperation(value="Get All Status")
	public List<Status> getAllStatus(){
		return masterDataService.getAllStatus();
		
	}
}
