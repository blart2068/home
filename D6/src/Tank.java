
class Tank extends Weapen {
	private char dir;
	public void setAttack(char dir){
		this.dir=dir;
	}
	public void sc(){
		new Weapen(1);
		System.out.println("����̹�ˣ���"+dir+"��ǰ���ٶ�Ϊ��"+sp+"�����ȼ�Ϊ"+Power);
	}
}
