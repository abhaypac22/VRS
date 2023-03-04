package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.services.AddressService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OwnerRegServices;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OwnerController {

	@Autowired
	LoginService lservice;
	
	@Autowired
	AddressService aservice;
	
	@Autowired
	OwnerRegServices oservice;
	
   public Owner regOwner(@RequestBody OwnerReg or)
   {
	   Login l=new Login(or.getEmailid(),or.getPassword(),or.getRole_name());
	   Address a=new Address(or.getApartmentno(), or.getArea(),or.getCity(), or.getState(), or.getCountry(),
				or.getPincode());
	   Login ls=lservice.save(l);
	   Address ad=aservice.save(a);
	   Owner o=new Owner(or.getFirstname(),or.getLastname(),or.getContactno(), ls, ad,
				or.getGovernmentIdno(), or.getGov_id_img());
	   return oservice.saved(o);
   }
	
}
