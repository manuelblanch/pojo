package com.iesebre.DAM2.pojo;
import com.google.gson.Gson;

public class Person {
	
	Person persona = new Person();
	
	private int person_id;
	private String person_givenName;
	private String person_sn1;
	private String person_sn2;
	private String person_email;
	private String person_secondary_email;
	private String person_official_id;
	private int person_official_id_type;
	private String person_date_of_birth;
	private String person_gender;
	private String person_secondary_official_id;
	private int person_secondary_official_id_type;
	private String person_homePostalAddress;
	private int person_photo;
	private int person_locality_id;
	private String person_telephoneNumber;
	private String person_mobile;
	private int person_bank_account_id;
	private String person_notes;
	private String person_entryDate;
	private String person_last_update;
	private String person_creationUserId;
	private String person_lastupdateUserId;
	private String person_markedForDeletion;
	private String person_markedForDeletionDate;
	private String date_of_birth;
	
	
	
public Person getPersona() {
		return persona;
	}



	public void setPersona(Person persona) {
		this.persona = persona;
	}



	public int getPerson_id() {
		return person_id;
	}



	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}



	public String getPerson_givenName() {
		return person_givenName;
	}



	public void setPerson_givenName(String person_givenName) {
		this.person_givenName = person_givenName;
	}



	public String getPerson_sn1() {
		return person_sn1;
	}



	public void setPerson_sn1(String person_sn1) {
		this.person_sn1 = person_sn1;
	}



	public String getPerson_sn2() {
		return person_sn2;
	}



	public void setPerson_sn2(String person_sn2) {
		this.person_sn2 = person_sn2;
	}



	public String getPerson_email() {
		return person_email;
	}



	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}



	public String getPerson_secondary_email() {
		return person_secondary_email;
	}



	public void setPerson_secondary_email(String person_secondary_email) {
		this.person_secondary_email = person_secondary_email;
	}



	public String getPerson_official_id() {
		return person_official_id;
	}



	public void setPerson_official_id(String person_official_id) {
		this.person_official_id = person_official_id;
	}



	public int getPerson_official_id_type() {
		return person_official_id_type;
	}



	public void setPerson_official_id_type(int person_official_id_type) {
		this.person_official_id_type = person_official_id_type;
	}



	public String getPerson_date_of_birth() {
		return person_date_of_birth;
	}



	public void setPerson_date_of_birth(String person_date_of_birth) {
		this.person_date_of_birth = person_date_of_birth;
	}



	public String isPerson_gender() {
		return person_gender;
	}



	public void setPerson_gender(String person_gender) {
		this.person_gender = person_gender;
	}



	public String getPerson_secondary_official_id() {
		return person_secondary_official_id;
	}



	public void setPerson_secondary_official_id(String person_secondary_official_id) {
		this.person_secondary_official_id = person_secondary_official_id;
	}



	public int getPerson_secondary_official_id_type() {
		return person_secondary_official_id_type;
	}



	public void setPerson_secondary_official_id_type(
			int person_secondary_official_id_type) {
		this.person_secondary_official_id_type = person_secondary_official_id_type;
	}



	public String getPerson_homePostalAddress() {
		return person_homePostalAddress;
	}



	public void setPerson_homePostalAddress(String person_homePostalAddress) {
		this.person_homePostalAddress = person_homePostalAddress;
	}



	public int getPerson_photo() {
		return person_photo;
	}



	public void setPerson_photo(int person_photo) {
		this.person_photo = person_photo;
	}



	public int getPerson_locality_id() {
		return person_locality_id;
	}



	public void setPerson_locality_id(int person_locality_id) {
		this.person_locality_id = person_locality_id;
	}



	public String getPerson_telephoneNumber() {
		return person_telephoneNumber;
	}



	public void setPerson_telephoneNumber(String person_telephoneNumber) {
		this.person_telephoneNumber = person_telephoneNumber;
	}



	public String getPerson_mobile() {
		return person_mobile;
	}



	public void setPerson_mobile(String person_mobile) {
		this.person_mobile = person_mobile;
	}



	public int getPerson_bank_account_id() {
		return person_bank_account_id;
	}



	public void setPerson_bank_account_id(int person_bank_account_id) {
		this.person_bank_account_id = person_bank_account_id;
	}



	public String getPerson_notes() {
		return person_notes;
	}



	public void setPerson_notes(String person_notes) {
		this.person_notes = person_notes;
	}



	public String getPerson_entryDate() {
		return person_entryDate;
	}



	public void setPerson_entryDate(String person_entryDate) {
		this.person_entryDate = person_entryDate;
	}



	public String getPerson_last_update() {
		return person_last_update;
	}



	public void setPerson_last_update(String person_last_update) {
		this.person_last_update = person_last_update;
	}



	public String getPerson_creationUserId() {
		return person_creationUserId;
	}



	public void setPerson_creationUserId(String person_creationUserId) {
		this.person_creationUserId = person_creationUserId;
	}



	public String getPerson_lastupdateUserId() {
		return person_lastupdateUserId;
	}



	public void setPerson_lastupdateUserId(String person_lastupdateUserId) {
		this.person_lastupdateUserId = person_lastupdateUserId;
	}



	public String getPerson_markedForDeletion() {
		return person_markedForDeletion;
	}



	public void setPerson_markedForDeletion(String person_markedForDeletion) {
		this.person_markedForDeletion = person_markedForDeletion;
	}



	public String getPerson_markedForDeletionDate() {
		return person_markedForDeletionDate;
	}



	public void setPerson_markedForDeletionDate(String person_markedForDeletionDate) {
		this.person_markedForDeletionDate = person_markedForDeletionDate;
	}



	public String getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



public Person() {
		super();
		this.persona = persona;
		this.person_id = person_id;
		this.person_givenName = person_givenName;
		this.person_sn1 = person_sn1;
		this.person_sn2 = person_sn2;
		this.person_email = person_email;
		this.person_secondary_email = person_secondary_email;
		this.person_official_id = person_official_id;
		this.person_official_id_type = person_official_id_type;
		this.person_date_of_birth = person_date_of_birth;
		this.person_gender = person_gender;
		this.person_secondary_official_id = person_secondary_official_id;
		this.person_secondary_official_id_type = person_secondary_official_id_type;
		this.person_homePostalAddress = person_homePostalAddress;
		this.person_photo = person_photo;
		this.person_locality_id = person_locality_id;
		this.person_telephoneNumber = person_telephoneNumber;
		this.person_mobile = person_mobile;
		this.person_bank_account_id = person_bank_account_id;
		this.person_notes = person_notes;
		this.person_entryDate = person_entryDate;
		this.person_last_update = person_last_update;
		this.person_creationUserId = person_creationUserId;
		this.person_lastupdateUserId = person_lastupdateUserId;
		this.person_markedForDeletion = person_markedForDeletion;
		this.person_markedForDeletionDate = person_markedForDeletionDate;
		this.date_of_birth = date_of_birth;
	}

public static void main(String... args) throws Exception {
	
	Person obj = new Person();
	
	Gson Gson = new Gson();
	
	String json = Gson.toJson(obj);
	
	System.out.println(json);
	
}	

}
