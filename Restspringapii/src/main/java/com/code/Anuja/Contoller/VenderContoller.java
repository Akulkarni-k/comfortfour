package com.code.Anuja.Contoller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.Anuja.model.Vender;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/vendercontoller")
public class VenderContoller {
	Vender vender;
@GetMapping("{venderid}")
	public Vender VenderContoller(String venderid)
	{
		
		System.out.println("hi contoller");
		return vender;
				  //new Vender("one", "Anuja", "pune", "9545214752");
	}
@PostMapping
public String createvenderdetails(@RequestBody Vender vender) {
	System.out.println("post mapping");
	
	return "create vender details all sussfully";
	
}
@PutMapping
public String putMethodName(@RequestBody Vender vender) {
	System.out.println("put mapping");
    
    this.vender= vender;
    return "update vender details all sussfully";
}
@DeleteMapping("{venderid}")
public String deleteMethodName(String venderid) {
	System.out.println("Delete mapping");
    
    this.vender= null;
    return "delete vender details all sussfully";
}

}
