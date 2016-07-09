//디스크 용량출력하기

package com.io10.file;

import java.io.File;

public class FileEx06 {

	public static void main(String[] args) {
		String drive;
		double totalSpace, usedSpace, freeSpace, usableSpace;

		// import java.io.File;
		// 하드디스크의 루트 드라이버들을 배열로 반환
		File[] roots = File.listRoots();

		for (File root : roots) {

			// 루트 드라이버의 절대 경로
			drive = root.getAbsolutePath();

			// 하드디스크 전체 용량
			//Math.pow(1024,3): 1024를 3승한 값이다, GB로 환산
			totalSpace = root.getTotalSpace() / Math.pow(1024, 3);
			// 사용가능한 디스크 용량
			usableSpace = root.getUsableSpace() / Math.pow(1024, 3);
			// 여유 디스크 용량
			freeSpace = root.getFreeSpace() / Math.pow(1024, 3);
			// 사용한 디스크 용량
			usedSpace = totalSpace - usableSpace;

			System.out.println("하드 디스크 드라이버: " + drive);
			System.out.println("총 디스크 용량: " + totalSpace + " GB");
			System.out.println("사용한 디스크 용량: " + usedSpace + " GB");
			System.out.println("사용 가능한 디스크 용량: " + usableSpace + " GB");
			System.out.println("여유 디스크 용량: " + freeSpace + " GB");
			System.out.println();

		}
	} //main
} //FileEx06