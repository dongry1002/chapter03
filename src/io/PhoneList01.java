package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br=null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}

			System.out.println("========파일정보===========");
			System.out.println("경로>>" + file.getAbsolutePath());
			System.out.println("사이즈>>" + file.length() + "Bytes");
			System.out.println(
					"마지막수정일>>" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

		
			
			System.out.println("=======전화번호=============");

			br=new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			
			String line=null;
			while((line=br.readLine())!=null){
				StringTokenizer st=
						new StringTokenizer(line, "\t ");
				
				int index=0;
				while(st.hasMoreTokens()){
					String token=st.nextToken();
					
			
					if(index==0){
						System.out.print(token+":");
					}else if(index==3){
						System.out.print(token);
					}else{
						System.out.print(token + "-");
					}
					index++;
				}
				System.out.println("");
			}
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();

		}catch(UnsupportedEncodingException e){
			 e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일읽기오류:"+e);
		}finally{
			try{
				if(br!=null){
					br.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
