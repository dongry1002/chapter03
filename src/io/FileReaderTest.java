package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
	FileReader fr=null;
	FileInputStream fis = null;
		try{
			fr=new FileReader("test.txt");
			int data=-1;
			while((data=fr.read()) !=-1){
				System.out.println((char)data);
			}
			System.out.println("==============");
			//바이트단위로 읽음
			fis = new FileInputStream("test.txt");
			while ((data=fr.read())!= -1){
				
				System.out.println((char)data);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다:"+e);
		}catch(IOException e){
			System.out.println("읽기오류"+e);
		}finally{
			try{
				if(fr !=null){
					fr.close();
				}
			}catch(IOException e){
				
			}
		}

	}

}
