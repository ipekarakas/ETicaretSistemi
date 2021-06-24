package entities.concretes;

import java.util.regex.Matcher;
import entities.concretes.User;
public class User {
	public static Object CASE_INSENSITIVE;
	private String ad;
	private String soyad;
	private String ePosta;
	private String parola;
	
	int length1 = ad.length();
	int length2 = soyad.length();
	int length3 = parola.length();
	
	
	public int getLength3() {
		return length3;
	}
	public void setLength3(int length3) {
		this.length3 = length3;
	}
	public User(String ad, String soyad, String ePosta, String parola) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ePosta = ePosta;
		this.parola = parola;
	}
	public int getLength1() {
		return length1;
	}
	public void setLength1(int length1) {
		this.length1 = length1;
	}
	public int getLength2() {
		return length2;
	}
	public void setLength2(int length2) {
		this.length2 = length2;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public String getePosta() {
		return ePosta;
	}
	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public static User compile(String emailPattern, Object cASE_INSENSITIVE2) {
		// TODO Auto-generated method stub
		return null;
	}
	public Matcher matcher(CharSequence inputStr) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object geteMail() {
		// TODO Auto-generated method stub
		return null;
	}
}
