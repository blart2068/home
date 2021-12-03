package gg;
public class User implements java.io.Serializable{
	private String xm,zl,bbh;
	public String getZl() {
		return zl;
	}
	public void setZl(String zl) {
		this.zl = zl;
	}
	public int getSj() {
		return sj;
	}
	public void setSj(int sj) {
		this.sj = sj;
	}
	public String getBbh() {
		return bbh;
	}
	public void setBbh(String bbh) {
		this.bbh = bbh;
	}
	private int yz;
	private int sj;
	public User(String xm,String bbh){//¹¹Ôìº¯Êý
		this.xm=xm;
		this.bbh=bbh;
	}
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	public int getYz() {
		return yz;
	}
	public void setYz(int yz) {
		this.yz = yz;
	}
	
	
}
