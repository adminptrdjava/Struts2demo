package org.com.action;

import java.util.ArrayList;

import org.com.bean.USD;

import com.model.bns.Userdtl;
import com.model.service.LoginService;
import com.model.service.UserdtlService;

public class BasicAction {
	private String uid;
	private String pass;
	private String pass2;
	private ArrayList<Userdtl> all;
    private  String mesg;
    
	public String execute() {

		System.out.println("HELLO STRUTS-2 IN ACTION");
		return "success";

	}

	

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public ArrayList<Userdtl> getAll() {
		return all;
	}

	public void setAll(ArrayList<Userdtl> all) {
		this.all = all;
	}
	
	public String getPass2() {
		return pass2;
	}



	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	
	

	public String getMesg() {
		return mesg;
	}



	public void setMesg(String mesg) {
		this.mesg = mesg;
	}

	

	
	/* METHODS HANDEL ACTIONS */
	
	public String loginperform() {
//		if (getUid().equals("admin") && getPass().equals("1234")){
//			return "success";
//			
//			
//			
//		}
//		else
//			return "failure";
		
		System.out.println("USER DTLS "+getUid()+getPass());
		Userdtl ud = new Userdtl();
		
		ud.setUid(this.getUid());
		ud.setPass(this.getPass());
		
		
		LoginService ls = new LoginService();
		 boolean flag =ls.loginmethod(ud);
		if(flag){
			USD d= new USD();
			d.setUid(getUid());
			return "success";
		}
		else
			return "failure";
	}
	
	public String allfetch(){
		System.out.println("FETCH ACTION");
		UserdtlService uds = new UserdtlService();
		ArrayList<Userdtl> a= uds.getdtls();
		
		if(a!=null){
		this.setAll(a);
		System.out.println("BEAN VALUE : "+a.get(0));
		return "success";
		}
		else
			return "faliure";
	}
	
	
	public String newuserreg(){
		
		System.out.println("ON ACTION INSERT");
		System.out.println("UD DTLS UD:"+this.getUid()+" PASS: "+this.getPass2());
		if(this.getPass().equals(this.getPass2())){
			Userdtl ud = new Userdtl();
			System.out.println("PASS CHEK ");
			ud.setUid(this.getUid());
			ud.setPass(this.getPass());
			UserdtlService uds = new UserdtlService();
			boolean flag = uds.adduser(ud);
			if(flag){
				this.setMesg("INSERTED ");
				Userdtl utl = UserdtlService.msgset();
				this.setMesg(this.getMesg()+" "+utl.getMsg());
				return "success";
			}
			else{
				this.setMesg("ERROR : ");
				Userdtl utl = UserdtlService.msgset();
				this.setMesg(this.getMesg()+" "+utl.getMsg());
				return "faliure";
				
			}
		}
		else{
			this.setMesg("ERROR : PASSWORD NOT MATCH ");
			return "faliure";
		}
		
		
	}





	
}
