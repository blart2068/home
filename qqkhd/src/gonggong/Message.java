package gonggong;

public class Message implements java.io.Serializable{
	private String xx,dx,nc,nr,time;//xx(��ϢY/N��֤��¼�����������)
	//dx(���� ָ������Ϣ��) nc(�ǳ�ָ���Լ�) nr(��������) time(ʱ��)
	private String []sss={"",""};
	
	public String[] getSss() {
		return sss;
	}

	public void setSss(String[] sss) {
		this.sss = sss;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getXx() {
		return xx;
	}

	public void setXx(String xx) {
		this.xx = xx;
	}

	public String getDx() {
		return dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getNc() {
		return nc;
	}

	public void setNc(String nc) {
		this.nc = nc;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
