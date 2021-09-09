package com.Calc;

import javax.swing.text.AbstractDocument.LeafElement;

public class OneDArray {

	public void oneDArrayDisp() {
		
		//int a[]= {1,2,3,4};
		
		String a[]= new String[2];
		a[0]="Govind";
		a[1]="S";
		//a[2]="Patil";
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(i +":" +a[i]);
		}
		
	}
	
	
	public void DoubleArray() {
		
		String a[][]=new String[3][3];
	a[0][0]="Govind";
	a[1][1]="S";
	a[2][2]="Patil";
	
	for(int i=0;i<=a.length-1;i++)
	{
		for(int k=0;k<=a.length-1;k++)
		{
		System.out.println(a[i][k]);
	}}
	}
	
	
	public static void main(String args[])
	{
		OneDArray oda=new OneDArray();
		oda.oneDArrayDisp();
		oda.DoubleArray();
	}
	
}
