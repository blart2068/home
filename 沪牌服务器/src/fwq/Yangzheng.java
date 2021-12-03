package fwq;

import java.io.BufferedReader;
import java.io.FileReader;

public class Yangzheng {
	private String path="D:/tbh.txt";
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean yz(String xx){
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String yhm="";
			while((yhm=br.readLine())!=null){
				if(yhm.equals(xx)){
					br.close();
					fr.close();
					return true;
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {}finally {
			
		}
		return false;
	}
}
