package mysql;
import java.sql.*;


public class sqltool {

	static String ur="";
	static String user="";
	static String passwd="";
	
    public static void main(String[] args){
    	//����һ��----
      //add("2018-01-13 15:26:19", "�̵س��������٣��ƶ�����", "�°���","189366521");
    	
    	//��ѯ-----
    	//System.out.println( new sqltool("jdbc:mysql://www.blart.pw:3306/blartsql"). show()); 
    	//System.out.println( new sqltool("jdbc:mysql://www.blart.pw:3306/blartsql"). mhcz("2018-03-19","192.168.1.95")); 
    	
    	//�޸�----------
        //update("�̵غ��塾���٣�pc����","18939980599","aya","8");
        
        //ɾ��---------
        //del("7");
      
    }
    public sqltool(String url,String userl,String passwdl) {
		ur=url;
		user=userl;
		passwd=passwdl;
	}
    
    //�������
    public  void add(String time,String name,String tel,String tuangouma,String pd) {
         
        String sql="insert into tuangoubiao (time,name,tel,tuangouma,passwd) values (?,?,?,?,?)";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, time);
            
            preStmt.setString(2, name);
            preStmt.setString(3, tel);
            preStmt.setString(4, tuangouma);
            preStmt.setString(5, pd);
            
            preStmt.executeUpdate();
            //Statement statement = (Statement) db.conn.createStatement();
            //statement.executeUpdate(sql);
            
            preStmt.close();
            db.close();//�ر����� 
            System.out.println("������");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //�������2
    public  void add2(String time,String xmmc,String name,String tel,String tuangouma,String ip) {
         
        String sql="insert into qmyxbiao (time,website,name,tel,tuangouma,ip) values (?,?,?,?,?,?)";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, time);
            preStmt.setString(2, xmmc);
            preStmt.setString(3, name);
            preStmt.setString(4, tel);
            preStmt.setString(5, tuangouma);
            preStmt.setString(6, ip);
            
            preStmt.executeUpdate();
            //Statement statement = (Statement) db.conn.createStatement();
            //statement.executeUpdate(sql);
            
            preStmt.close();
            db.close();//�ر����� 
            System.out.println("������");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    //ģ�����ҡ�
    public boolean mhcz(String time,String ip){
    	int i=0;
    	
    	 String sql ="select * from qmyxbiao where time like '%"+time+"%' and ip = '"+ip+"'";
    
    	 
         DBConnection db = new DBConnection(ur,user,passwd);
         try {
             Statement stmt = (Statement) db.conn.createStatement();
             ResultSet rs = (ResultSet) stmt.executeQuery(sql);
             while(rs.next()){
                
                 if (rs.getString("ip").equals(ip)) {
                	 i++;
                	 if (i>2) {
                		 rs.close();
                         db.close();//�ر����� 
    					return false;
					}
                	
				}
             }
             rs.close();
             db.close();//�ر����� 
         } catch (SQLException e) {
             e.printStackTrace();
         } 
         return true;
    }
    
    //���Ҳ���
    public  String show(){
         String sql ="select * from tuangoubiao";
         DBConnection db = new DBConnection(ur,user,passwd);
         String biaobi = "------------------------------------------------------------------------------------\n"+
        		"���"+"\t\t"+"ʱ��" +"\t\t\t"+ "��վ" +"\t\t\t"+ "����"+"\t"+"    �绰\n"+
         "------------------------------------------------------------------------------------\n";
         String suju ="";
         
         try {
            Statement stmt = (Statement) db.conn.createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()){
            	String number = rs.getString("number");
                String time = rs.getString("time");
                
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String tuangouma = rs.getString("tuangouma");
                //���Խ����ҵ���ֵд���࣬Ȼ�󷵻���Ӧ�Ķ��� 
                //���� ��������Ķ˿���ʾһ��
                suju =suju+ (number+"\t"+time +"\t"+ name+"\t"+ tel+"\t"+ tuangouma+"\n");
            }
            rs.close();
            db.close();//�ر����� 
        } catch (SQLException e) {
            e.printStackTrace();
        } 
         //System.out.println(biaobi+suju);
         return biaobi+suju;
    }
    //���²���
    public void update(String tuangouma,String tel,String name,String number) {
       
        String sql="update tuangoubiao set tuangouma=?,tel=?,name=? where number=?";
        DBConnection db = new DBConnection(ur,user,passwd);
        
        try {
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, tuangouma);
            preStmt.setString(2, tel);
            preStmt.setString(3, name);
            preStmt.setString(4, number);
 
            preStmt.executeUpdate();
            
            preStmt.close();
            db.close();//�ر����� 
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    //ɾ������
    public void del(String number) {
       
        String sql="delete from tuangoubiao where number=?";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {    
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, number);
            preStmt.executeUpdate();
            
            preStmt.close();
            db.close();//�ر����� 
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
}