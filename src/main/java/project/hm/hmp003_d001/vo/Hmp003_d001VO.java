package project.hm.hmp003_d001.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("p003VO") 
public class Hmp003_d001VO {
	private String prod_id, vend_name, prod_name, prod_desc;
	private int prod_price;
	
	public Hmp003_d001VO() {	}
	
	public Hmp003_d001VO(String prod_id, String prod_name, int prod_price, String prod_desc, String vend_name) {
		super();
		this.prod_id = prod_id;
		this.vend_name = vend_name;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getVend_name() {
		return vend_name;
	}
	public void setVend_name(String vend_name) {
		this.vend_name = vend_name;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	
	
	
}
