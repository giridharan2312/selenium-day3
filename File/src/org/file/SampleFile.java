package org.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class SampleFile {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Sample\\ Sample.txt");
//		FileUtils.write(f, "java", true);
		FileUtils.write(f, "selenium", false);
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
//
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
//
//		boolean canWrite = f.canWrite();
//		System.out.println(canWrite);
//
//		boolean execute = f.canExecute();
//		System.out.println(execute);
//
//		File canonicalFile = f.getCanonicalFile();
//		System.out.println(canonicalFile);

//		String[] list = f.list();
//		for (String l : list) {
//			System.out.println(l);
//		}
//		
//		File[] listFiles = f.listFiles();
//		for (File file : listFiles) {
//			System.out.println(file);
//		}

	}
}
