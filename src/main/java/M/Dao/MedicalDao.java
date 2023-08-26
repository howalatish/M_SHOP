package M.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import M.Entity.Insert_Medicine;

public interface MedicalDao extends CrudRepository<Insert_Medicine, Integer> {

 
	@Override
	public List<Insert_Medicine> findAll();

	public List<Insert_Medicine> findByProductName(String productName);
	
}
