package com.works.usetink.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	//public static void main(String[] args) throws Exception {
		
		/*
		String key128Bit = "aNdRgUkXn2r5u8x/";
		String plainText = "123;ali@ali.com;true";
		String associatedData = "extra_key";

		TinkEncrypt encrypt = new TinkEncrypt();
		String encString = encrypt.encrypt(key128Bit, plainText, associatedData);
		System.out.println(encString);
		
		File file = new File("sample.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.append(encString);
		
		fileWriter.close();
		*/
		
		/*
		String key128Bit = "aNdRgUkXn2r5u8x/";
		String associatedData = "extra_key";
		
		File file = new File("sample.txt");
		Scanner scanner = new Scanner(file);
		StringBuilder builder = new StringBuilder();
		while( scanner.hasNext() ) {
			builder.append(scanner.nextLine());
		}
		
		
		TinkDecrypt decrypt = new TinkDecrypt();
		String decryptString = decrypt.decrypt(key128Bit, builder.toString(), associatedData);
		System.out.println(decryptString);
		*/
		

	//}

}
