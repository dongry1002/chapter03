package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		
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
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String name = scanner.next();
				String phone1=scanner.next();
				String phone2=scanner.next();
				String phone3=scanner.next();
				
				System.out.println(name+":"+phone1+"-"+phone2+"-"+phone3);
				
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		
	}

}
