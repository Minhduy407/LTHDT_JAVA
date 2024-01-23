package file;
/*
*@(#)Main.java.java  December 19, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/

/**
 * 
 */
/*
* @description:
* @author: Chopper
* @date: December 19, 2023
* @version: 1.0
*/

import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("Test.txt");
			f.write("Phan My Tien");
			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
