package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try {
			FileOutputStream fos=new FileOutputStream("1234.txt");
			
			bos= new BufferedOutputStream(fos, 5);
			
			
			for(int i='0';i<'9';i++){
				bos.write(i);
			bos.flush();//강제로 버퍼를 비움(디스크에 씀)
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일열기실패:"+e);
		}catch(IOException e){
			System.out.println("파일열기실패:"+e);
		}finally{
			try{
				if(bos !=null){
					bos.close();
				}
				}
			catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	
		
	}


