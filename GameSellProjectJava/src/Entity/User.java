package Entity;

public class User {
	private String name;
	private String surName;
	private int no;
	private String dogumYili;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>2) {
			this.name = name;
		}
		else
			System.out.println("ad 3 harften kýsa olamaz");
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		if(surName.length()>2) {
			this.surName=surName;
		}
		else
			System.out.println("soyad 3 harften kýsa olamaz");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		if(no>=100) {
			this.no = no;
		}
		else
			System.out.println("numara 3 basamaktan az olamaz kullanýcý no su eklenemedi");
	}
	public String getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}
}
