package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		//기반 스트림은 System.in (표준입력을 사용)
		BufferedReader br=null;
		
		try {
			InputStreamReader isr=new InputStreamReader(System.in,"utf-8");
			
			 br=new BufferedReader(isr);
			String line = null;
			
			while(true){
				System.out.println(">>");
				line = br.readLine();
				if("exit".equals(line)){
					break;	
				}
				System.out.println();
			}
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
