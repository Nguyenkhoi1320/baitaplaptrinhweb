package pxu.edu.vn.bt1;

public class ProductModel {
private int productID;
private String productName;

public ProductModel(int productID, String productName) {
	super();
	this.productID = productID;
	this.productName = productName;
}
public ProductModel() {
	super();
	// TODO Auto-generated constructor stub
}
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
@Override
public String toString() {
	return "ProductModel [productID=" + productID + ", productName=" + productName + "]";
}

}
