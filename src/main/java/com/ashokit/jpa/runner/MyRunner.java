package com.ashokit.jpa.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.entities.CategoryEntity;
import com.ashokit.jpa.entities.ProductEntity;
import com.ashokit.jpa.entities.VendorEntity;
import com.ashokit.jpa.repository.CategoryEntityRepository;
import com.ashokit.jpa.repository.VendorEntityRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	VendorEntityRepository vendorRepo;

	@Autowired
	CategoryEntityRepository catRepo;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		/*
		  VendorEntity entity = new VendorEntity(); entity.setVendorId(1001);
		  entity.setVendorName("Samsung");
		  
		  ProductEntity pEntity1 = new ProductEntity(); pEntity1.setProductId(2001);
		  pEntity1.setProductName("Fridge");
		  
		  ProductEntity pEntity2 = new ProductEntity(); pEntity2.setProductId(3001);
		  pEntity2.setProductName("TV");
		  
		  ProductEntity pEntity3 = new ProductEntity(); pEntity3.setProductId(4001);
		  pEntity3.setProductName("AC");
		  
		  List<ProductEntity> productsList = Arrays.asList(pEntity1, pEntity2,
		  pEntity3);
		  entity.setProductsList(productsList);
		  
		  
		  VendorEntity entity1 = new VendorEntity(); entity1.setVendorId(1002);
		  entity1.setVendorName("Microsoft");
		  
		  ProductEntity pEntity4 = new ProductEntity(); pEntity4.setProductId(2002);
		  pEntity4.setProductName("Windows");
		  
		  ProductEntity pEntity5 = new ProductEntity(); pEntity5.setProductId(3002);
		  pEntity5.setProductName("Office");
		  
		  ProductEntity pEntity6 = new ProductEntity(); pEntity6.setProductId(4002);
		  pEntity6.setProductName("Outlook");
		  
		  List<ProductEntity> productsList1 = Arrays.asList(pEntity4, pEntity5,
		  pEntity6);
		  entity1.setProductsList(productsList1);
		  
		  
		  CategoryEntity cEntity=new CategoryEntity();
		  cEntity.setId(1);
		  cEntity.setName("IT");
		  
		  List<VendorEntity> listVendors=new ArrayList<>();
		  listVendors.add(entity);
		  listVendors.add(entity1);
		  
		  cEntity.setVendorList(listVendors);
		  
		  catRepo.save(cEntity);
		  /*  
		 * Optional<VendorEntity> opt=vendorRepo.findById(1001); if(opt.isPresent()) {
		 * VendorEntity ve=opt.get();
		 * System.out.println(ve.getVendorId()+" : "+ve.getVendorName());
		 * List<ProductEntity> listProduct=ve.getProductsList();
		 * listProduct.forEach(System.out::println); }
		 

		Optional<VendorEntity> opt = vendorRepo.findById(1002);
		if (opt.isPresent()) {
			VendorEntity ve = opt.get();
			List<ProductEntity> listProduct = ve.getProductsList();
			Iterator<ProductEntity> i = listProduct.iterator();
			while (i.hasNext()) {
				ProductEntity pe = i.next();
				if (pe.getProductId() == 4002) {
					i.remove();
				}
			}
		}
		
		
		
		List<Object[]> lst=vendorRepo.fetchVendorNameWithProductNames();
		lst.forEach(obj->System.out.println(obj[0]+" , "+obj[1]));

		
		//List<VendorEntity> vList=vendorRepo.findAll();
		 * 
		 * 
		*/ 
		
		//Optional<CategoryEntity> opt=catRepo.findById(1);
		
		List<Object[]> lst=vendorRepo.fetchData();
		lst.forEach(obj -> System.out.println(obj[0]+"   "+obj[1]+"   "+obj[2]));
		
	}

}
