package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class B extends A{
	
	public void sub(int a, int b)
	{
		System.out.println(b-a);
	}
	
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}

	
}
