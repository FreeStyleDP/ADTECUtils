package com.mytest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("all:/home/esb/versionTest/etc/COMM/ACCT_CLI".substring("/home/esb/versionTest/".length()-1));
//		try {
////			FileUtils.copyDirectory(new File("D:\\dp_work\\9_book\\"), new File("c:\\"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("isD："+ (new File("D:\\dp_work\\9_book\\")).isDirectory());
		String s = "dsef.xml";
		String path = "sdf/dsefaf/dsef.xml";
		System.out.println(s.replaceAll(".xml", ""));
		System.out.println(path.replaceAll("dsef.xml", ""));
		System.out.println("sfd\bsfd");
	}
}
