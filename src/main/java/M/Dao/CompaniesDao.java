package M.Dao;

import org.springframework.data.repository.CrudRepository;

import M.Entity.Insert_Companies;

public interface CompaniesDao extends CrudRepository<Insert_Companies, Integer> {

}
