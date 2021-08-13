package mx.tec.web.lab.vo;
import java.util.List;

public class Product {
	private String id; 
	private String name; 
	private String description;
	private String smallImageUrl;
	private String mediumImageUrl;
	private String largeImageUrl;
	private List<Sku> childSkus;
	/**
	 * 
	 */
	public Product() {
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param smallImageUrl;
	 * @param mediumImageUrl;
	 * @param largeImageUrl;
	 * @param childSkus
	 */
	public Product(String id, String name, String description,String smallImageUrl, String mediumImageUrl, String largeImageUrl, List<Sku> childSkus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.smallImageUrl = smallImageUrl;
		this.mediumImageUrl = mediumImageUrl;
		this.largeImageUrl = largeImageUrl;
		this.childSkus = childSkus;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the smallImageUrl
	 */
	public String getSmallImageUrl() {
		return smallImageUrl;
	}
	/**
	 * @param set smallImageUrl
	 */
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	/**
	 * @return the mediumImageUrl
	 */
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}
	/**
	 * @param set mediumImageUrl
	 */
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	/**
	 * @return the largeImageUrl
	 */
	public String getLargeImageUrl() {
		return largeImageUrl;
	}
	/**
	 * @param set largeImageUrl
	 */
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
	/**
	 * @return the childSkus
	 */
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	} 
}
