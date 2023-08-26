package M.Cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import M.Entity.Insert_Medicine;
import M.Service.MedicalService;

@RestController
@CrossOrigin
@RequestMapping("/Mshop")
public class HomeController {

	@Autowired
	MedicalService ms;
	@GetMapping("/AllMedicineProducts")
	public List<Insert_Medicine> SelectAllMedicines(){
	 return  ms.SelectAllMedicines();
		
	}
	
	@GetMapping("/searchByName/{productName}")
	private List<Insert_Medicine> SerchMedicineByName(@PathVariable String productName) {
	 return ms.SerchMedicineByName(productName);

	}
	{}
	
}
