package com.ashokit.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.jpa.entities.VendorEntity;

public interface VendorEntityRepository extends JpaRepository<VendorEntity, Integer> {
	@Query(value = "select v.vendorName, p.productName from VendorEntity v left join v.productsList p")
	List<Object[]> fetchVendorNameWithProductNames();
	
	@Query(value = "select c.name, v.vendorName, p.productName from CategoryEntity c join c.vendorList v join v.productsList p ")
	List<Object[]> fetchData();

}
