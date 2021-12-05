package com.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lambok.Data;

@Data
@ApiModel("OLX-Masterdata")

public class Category {
	@ApiModelProperty("id of the MasterData")
	private int id;
	@ApiModelProperty("MasterData Category")
	private String category;
	public Category(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}
	public Category() {}
	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
