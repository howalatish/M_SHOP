package M.Cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import M.Entity.Insert_Medicine;
import M.Service.MedicalService;


@RequestMapping("/Medicine")
@CrossOrigin
@RestController
public class MedicineController {

	@Autowired
	MedicalService ms;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Insert_Medicine im){
		ms.insert(im); 
		return "Record Insert";
	}
}
