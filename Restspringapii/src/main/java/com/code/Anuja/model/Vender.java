package com.code.Anuja.model;

public class Vender {
private String venderid;
private String vendername;
private String venderaddress;
private String venderphoneno;






public Vender(String i, String vendername, String venderaddress, String venderphoneno) {
	super();
	this.venderid = i;
	this.vendername = vendername;
	this.venderaddress = venderaddress;
	this.venderphoneno = venderphoneno;
}
public String getVenderid() {
	return venderid;
}
public void setVenderid(String venderid) {
	this.venderid = venderid;
}
public String getVendername() {
	return vendername;
}
public void setVendername(String vendername) {
	this.vendername = vendername;
}
public String getVenderaddress() {
	return venderaddress;
}
public void setVenderaddress(String venderaddress) {
	this.venderaddress = venderaddress;
}
public String getVenderphoneno() {
	return venderphoneno;
}
public void setVenderphoneno(String venderphoneno) {
	this.venderphoneno = venderphoneno;
}




}
