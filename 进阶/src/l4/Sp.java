package l4;

public class Sp {
	private String mc;
	private String bh;
	private double jg;
	Sp(){}
	
	Sp(String bh, String mc, double jg){
		this.bh=bh;
		this.mc=mc;
		this.jg=jg;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public double getJg() {
		return jg;
	}
	public void setJg(double jg) {
		this.jg = jg;
	}
	public String toString(){
		return "编号为："+bh+"\t食品名称为："+mc+"\t价格为："+jg;
	}
}
