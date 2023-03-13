package com.ashokit.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="PRODUCTS")
@Data
public class ProductEntity {

	@Id
	@Column(name="PROD_ID")
	private Integer productId;
	
	@Column(name="PROD_NAME")
	private String productName;
}
