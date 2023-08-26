package M.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insert_medicine")
public class Insert_Medicine {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	@Column(name="productid")
	private int productId;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="productcategory")
	private String productCategory;
	
	@Column(name="productquantity")
	private int productQuantity;
	
	@Column(name="productprice")
	private float productPrice;
	
	public String getProductName() {
		return productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
	public Insert_Medicine(int productId, String productName, String companyName, String productCategory,
			int productQuantity, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.companyName = companyName;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	public Insert_Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
