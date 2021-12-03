package tank;

public class Tank {
	private int x=0,y=0,sd=5,fx=2;
	private boolean tksm=true;
	private boolean pz=false;
	private Zhuankuai zk=null;
	private Gangban gk=null;
	private Heliu hk=null;
	public boolean tkpz(){//碰撞
		switch (fx) {
		case 1://方向上
			for(int i=0;i<Mypanel.dtk.size()+1;i++){
				Tank tk=null;
				if(i<Mypanel.dtk.size()){
					tk=(Tank)Mypanel.dtk.get(i);
				}else{
					tk=(Tank)Mypanel.mt;
				}
				if(tk!=this&&this.tksm==true&&tk.tksm==true){
					if(x>=tk.getX()&&x<=tk.getX()+40&&y>=tk.getY()&&y<=tk.getY()+40){//坦克
						return false;
					}
					if(x+40>=tk.getX()&&x+40<=tk.getX()+40&&y>=tk.getY()&&y<=tk.getY()+40){//坦克
						return false;
					}
					for(int j=0;j<Map.gkjh.size();j++){//钢板
						gk=Map.gkjh.get(j);
						int yx=x+20; int yy=y+20;int gkyx=gk.getX()+20;int gkyy=gk.getY()+20;
						if(yx>gkyx-40&&yx<gkyx+40&&y>=gk.getY()&&y<=gk.getY()+40){
							return false;
						}
					}
					for(int j=0;j<Map.hkjh.size();j++){//河流
						hk=Map.hkjh.get(j);
						int yx=x+20; int yy=y+20;int hkyx=hk.getX()+20;int hkyy=hk.getY()+20;
						if(yx>hkyx-40&&yx<hkyx+40&&y>=hk.getY()&&y<=hk.getY()+40){
							return false;
						}
					}
					for(int j=0;j<Map.zkjh.size();j++){//砖块
						zk=Map.zkjh.get(j); 
						int yx=x+20; int yy=y+20;int zkyx=zk.getX()+10;int zkyy=zk.getY()+10;
						if(yx>zkyx-30&&yx<zkyx+30&&y>=zk.getY()&&y<=zk.getY()+20
								&&Map.zkjh.get(j).getSm()){
							return false;
						}
					}
				}
			}
			break;
		case 2://方向下
			for(int i=0;i<Mypanel.dtk.size()+1;i++){
				Tank tk=null;
				if(i<Mypanel.dtk.size()){
					tk=(Tank)Mypanel.dtk.get(i);
				}else{
					tk=(Tank)Mypanel.mt;
				}
				if(tk!=this&&this.tksm==true&&tk.tksm==true){
					if(x>=tk.getX()&&x<=tk.getX()+40&&y+40>=tk.getY()&&y+40<=tk.getY()+40){
						return false;
					}
					if(x+40>=tk.getX()&&x+40<=tk.getX()+40&&y+40>=tk.getY()&&y+40<=tk.getY()+40){
						return false;
					}
					for(int j=0;j<Map.gkjh.size();j++){//钢板
						gk=Map.gkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=gk.getX()+20;int zkyy=gk.getY()+20;
						if(yx>zkyx-40&&yx<zkyx+40&&y+40>=gk.getY()&&y+40<=gk.getY()+40){
							return false;
						}
					}
					for(int j=0;j<Map.hkjh.size();j++){//河流
						hk=Map.hkjh.get(j);
						int yx=x+20; int yy=y+20;int hkyx=hk.getX()+20;int hkyy=hk.getY()+20;
						if(yx>hkyx-40&&yx<hkyx+40&&y+40>=hk.getY()&&y+40<=hk.getY()+40){
							return false;
						}
					}
					for(int j=0;j<Map.zkjh.size();j++){//---砖块
						zk=Map.zkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=zk.getX()+10;int zkyy=zk.getY()+10;
						if(yx>zkyx-30&&yx<zkyx+30&&y+40>=zk.getY()&&y+40<=zk.getY()+20
								&&Map.zkjh.get(j).getSm()){
							return false;
						}
					}
				}
			}
			break;
		case 3://方向左
			for(int i=0;i<Mypanel.dtk.size()+1;i++){
				Tank tk=null;
				if(i<Mypanel.dtk.size()){
					tk=(Tank)Mypanel.dtk.get(i);
				}else{
					tk=(Tank)Mypanel.mt;
				}
				if(tk!=this&&this.tksm==true&&tk.tksm==true){
					if(y>=tk.getY()&&y<=tk.getY()+40&&x>=tk.getX()&&x<=tk.getX()+40){
						return false;
					}
					if(y+40>=tk.getY()&&y+40<=tk.getY()+40&&x>=tk.getX()&&x<=tk.getX()+40){
						return false;
					}
					for(int j=0;j<Map.gkjh.size();j++){//钢板
						gk=Map.gkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=gk.getX()+20;int zkyy=gk.getY()+20;
						if(yy>zkyy-40&&yy<zkyy+40&&x>=gk.getX()&&x<=gk.getX()+40){
							return false;
						}
					}
					for(int j=0;j<Map.hkjh.size();j++){//河流
						hk=Map.hkjh.get(j);
						int yx=x+20; int yy=y+20;int hkyx=hk.getX()+20;int hkyy=hk.getY()+20;
						if(yy>hkyy-40&&yy<hkyy+40&&x>=hk.getX()&&x<=hk.getX()+40){
							return false;
						}
					}
					for(int j=0;j<Map.zkjh.size();j++){//砖块
						zk=Map.zkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=zk.getX()+10;int zkyy=zk.getY()+10;
						if(yy>zkyy-30&&yy<zkyy+30&&x>=zk.getX()&&x<=zk.getX()+20
								&&Map.zkjh.get(j).getSm()){
							return false;
						}
					}
				}
			}
			break;
		case 4://方向右
			for(int i=0;i<Mypanel.dtk.size()+1;i++){
				Tank tk=null;
				if(i<Mypanel.dtk.size()){
					tk=(Tank)Mypanel.dtk.get(i);
				}else{
					tk=(Tank)Mypanel.mt;
				}
				if(tk!=this&&this.tksm==true&&tk.tksm==true){//坦克
					if(y>=tk.getY()&&y<=tk.getY()+40&&x+40>=tk.getX()&&x+40<=tk.getX()+40){
						return false;
					}
					if(y+40>=tk.getY()&&y+40<=tk.getY()+40&&x+40>=tk.getX()&&x+40<=tk.getX()+40){
						return false;
					}
					for(int j=0;j<Map.gkjh.size();j++){//钢板
						gk=Map.gkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=gk.getX()+20;int zkyy=gk.getY()+20;
						if(yy>zkyy-40&&yy<zkyy+40&&x+40>=gk.getX()&&x+40<=gk.getX()+40){
							return false;
						}
					}
					for(int j=0;j<Map.hkjh.size();j++){//河流
						hk=Map.hkjh.get(j);
						int yx=x+20; int yy=y+20;int hkyx=hk.getX()+20;int hkyy=hk.getY()+20;
						if(yy>hkyy-40&&yy<hkyy+40&&x+40>=hk.getX()&&x+40<=hk.getX()+40){
							return false;
						}
					}
					for(int j=0;j<Map.zkjh.size();j++){//砖块
						zk=Map.zkjh.get(j);
						int yx=x+20; int yy=y+20;int zkyx=zk.getX()+10;int zkyy=zk.getY()+10;
						if(yy>zkyy-30&&yy<zkyy+30&&x+40>=zk.getX()&&x+40<=zk.getX()+20
								&&Map.zkjh.get(j).getSm()){
							return false;
						}
					}
				}
			}
			break;
		}
		return true;
	}


	public boolean getPz() {
		return pz;
	}

	public void setPz(boolean pz) {
		this.pz = pz;
	}

	public boolean getTksm() {
		return tksm;
	}

	public void setTksm(boolean tksm) {
		this.tksm = tksm;
	}

	public int getSd() {
		return sd;
	}

	public void setSd(int sd) {
		this.sd = sd;
	}

	public int getFx() {
		return fx;
	}

	public void setFx(int fx) {
		this.fx = fx;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	Tank(int x,int y){
		this.x=x;
		this.y=y;
	}

}
