package org.com.action;

import java.util.ArrayList;

import com.model.bns.Userdtl;
import com.model.bns.ZoneBean;
import com.model.service.ZoneManage;

public class Zonemanage  {

	private String zname;
	private String zid;
	private String zpin;
	private String zadd;
	private String ztype;
	private String Zmsg;
	private ArrayList< ZoneBean> allz;
	
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public String getZid() {
		return zid;
	}
	public void setZid(String zid) {
		this.zid = zid;
	}
	public String getZpin() {
		return zpin;
	}
	public void setZpin(String zpin) {
		this.zpin = zpin;
	}
	public String getZadd() {
		return zadd;
	}
	public void setZadd(String zadd) {
		this.zadd = zadd;
	}
	public String getZtype() {
		return ztype;
	}
	public void setZtype(String ztype) {
		this.ztype = ztype;
	}
	public ArrayList< ZoneBean> getAllz() {
		return allz;
	}
	public void setAllz(ArrayList< ZoneBean> allz) {
		this.allz = allz;
	}
	
	public String zonelist(){
		
		ZoneManage zm = new ZoneManage();
		ArrayList< ZoneBean> a=zm.zoneview();
		if(a!=null){
			this.setAllz(a);
			return "success";
		}
		else{
			return "faliure";
		}
		
		
	}
	
	public String zoneadd(){
		
		ZoneManage zm = new ZoneManage();
		ZoneBean zb = new ZoneBean();
		zb.setZadd(this.getZadd());
		zb.setZname(this.getZname());
		zb.setZpin(this.getZpin());
		zb.setZtype(this.getZtype());
		boolean flag=zm.zoneaddMethod(zb);
		if(flag){
			this.setZmsg("INSERT DONE");
			return "success";
		}else{
			this.setZmsg("INSERT ERROR");
			return "faliure";
		}
	}
	public String getZmsg() {
		return Zmsg;
	}
	public void setZmsg(String zmsg) {
		Zmsg = zmsg;
	}
	
	
}
