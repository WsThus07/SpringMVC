package entities;

public class Article {
private Integer idArticle;
private String description;
private String brand;
private float price;
public Article() {}
public Article(Integer idArticle, String description, String brand, float price) {
	super();
	this.idArticle = idArticle;
	this.description = description;
	this.brand = brand;
	this.price = price;
}
public Integer getIdArticle() {
	return idArticle;
}
public void setIdArticle(Integer idArticle) {
	this.idArticle = idArticle;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Article [IdArticle=" + idArticle + ", description=" + description + ", brand=" + brand + ", price=" + price
			+ "]";
};

}
