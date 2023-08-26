package M.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import M.Dao.CompaniesDao;
import M.Dao.MedicalDao;
import M.Entity.Insert_Companies;
import M.Entity.Insert_Medicine;


@Service
public class MedicalService {
	
	@Autowired
	MedicalDao md;
	
	@Autowired
	CompaniesDao cd;
	
	public void insert(Insert_Medicine im) {
		
		md.save(im);
		
	}
	
	
	public void insert(Insert_Companies ic) {
		cd.save(ic);
		
	}


	
		


		public List<Insert_Medicine> SelectAllMedicines() {
			List<Insert_Medicine> list = md.findAll();
			return list;
			
		}


		public List<Insert_Medicine> SerchMedicineByName(String productName) {
			
			List<Insert_Medicine> list =  md.findByProductName(productName);
			return list;
			
			
			
		}
		
	

}
