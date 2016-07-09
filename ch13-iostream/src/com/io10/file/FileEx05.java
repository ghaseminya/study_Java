//File 클래스 활용한 파일 관리

package com.io10.file;

import java.io.File;

public class FileEx05 {
	
	//import java.io.File;
	public static void dir(File fd) {
		String[] filenames = fd.list();
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified(); // 마지막으로 수정된 시간
			System.out.print(s);
			System.out.print("\t파일 크기: " + f.length()); // 파일 크기
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {

		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\CodeLab\\workspace");
		File f3 = new File("c:\\CodeLab");
		String res;
		
		if (f1.isFile()) // 파일 타입이면
			res = "파일";
		else // 디렉터리 타입이면
			res = "디렉터리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		
		if (!f2.exists()) { // f2가 나타내는 파일이 존재하는지 검사
			if (!f2.mkdir()) // 존재하지 않으면 디렉터리 생성
				System.out.println("디렉터리 생성 실패");
		}

		if (f2.isFile()) // 파일 타입이면
			res = "파일";
		else // 디렉터리 타입이면
			res = "디렉터리";
		System.out.println(f2.getPath() + "은 " + res + "입니다.");
		
		dir(f3); // c:\CodeLab에 있는 파일과 디렉터리 화면에 출력

		// 파일 이름 변경
		f2.renameTo(new File("c:\\tmp\\javasample"));
		dir(f3);
	}

}
