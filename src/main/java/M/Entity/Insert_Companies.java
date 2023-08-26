package M.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insert_company")
public class Insert_Companies {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	@Column(name="companyid")
	private int companyId;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="companycountry")
	private String companyCountry;
	
	@Column(name="companyemail")
	private String companyEmail;
	
	@Column(name="companycontactno")
	private String companyContactNo;
	
	@Column(name="companyaddress")
	private String companyAddress;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCountry() {
		return companyCountry;
	}

	public void setCompanyCountry(String companyCountry) {
		this.companyCountry = companyCountry;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyContactNo() {
		return companyContactNo;
	}

	public void setCompanyContactNo(String companyContactNo) {
		this.companyContactNo = companyContactNo;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Insert_Companies(int companyId, String companyName, String companyCountry, String companyEmail,
			String companyContactNo, String companyAddress) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyCountry = companyCountry;
		this.companyEmail = companyEmail;
		this.companyContactNo = companyContactNo;
		this.companyAddress = companyAddress;
	}

	public Insert_Companies() {
		// TODO Auto-generated constructor stub
	}

	
}
