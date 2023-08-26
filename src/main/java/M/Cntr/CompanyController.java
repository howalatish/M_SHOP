package M.Cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import M.Entity.Insert_Companies;
import M.Service.MedicalService;

@RestController
@CrossOrigin
@RequestMapping("/Company")
public class CompanyController {

	@Autowired
	MedicalService ms;
	
	@PostMapping("/insert")
	public String  insert(@RequestBody Insert_Companies ic){
		ms.insert(ic);
		return "Record Added";
		
	}
}
