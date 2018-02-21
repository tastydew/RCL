package rcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "contacts")
@EntityListeners(AuditingEntityListener.class)
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	@Column
	private String nameTitle;
	@Column
	private String firstName;
	@Column
	private Character middleInitial;
	@Column
	private String lastName;
	@Column
	private String companyName;
	@Column
	private String addressOne;
	@Column
	private String addressTwo;
	@Column
	private String cityName;
	@Column
	private String stateName;
	@Column
	private Integer zipCode;
	@Column
	private String country;
	@Column
	private Integer phoneNumber;
	
	public Contact() {}
	
	/**
	 * @return the iD
	 */

	public Long getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(Long iD) {
		ID = iD;
	}
	/**
	 * @return the nameTitle
	 */
	public String getNameTitle() {
		return nameTitle;
	}
	/**
	 * @param nameTitle the nameTitle to set
	 */
	public Contact setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
		return this;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public Contact setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	/**
	 * @return the middleInitial
	 */
	public Character getMiddleInitial() {
		return middleInitial;
	}
	/**
	 * @param middleInitial the middleInitial to set
	 */
	public Contact setMiddleInitial(Character middleInitial) {
		this.middleInitial = middleInitial;
		return this;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public Contact setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public Contact setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}
	/**
	 * @return the addressOne
	 */
	public String getAddressOne() {
		return addressOne;
	}
	/**
	 * @param addressOne the addressOne to set
	 */
	public Contact setAddressOne(String addressOne) {
		this.addressOne = addressOne;
		return this;
	}
	/**
	 * @return the addressTwo
	 */
	public String getAddressTwo() {
		return addressTwo;
	}
	/**
	 * @param addressTwo the addressTwo to set
	 */
	public Contact setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
		return this;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public Contact setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}
	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}
	/**
	 * @param stateName the stateName to set
	 */
	public Contact setStateName(String stateName) {
		this.stateName = stateName;
		return this;
	}
	/**
	 * @return the zipCode
	 */
	public Integer getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public Contact setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
		return this;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public Contact setCountry(String country) {
		this.country = country;
		return this;
	}
	/**
	 * @return the phoneNumber
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public Contact setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
}