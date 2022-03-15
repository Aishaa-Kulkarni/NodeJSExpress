package com.camblyprogrammingassessment.prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProgrammingAssignment {

	public static void main(String[] args) {

		  StringOccurence stringOccurence = new StringOccurence();
		     InputStreamReader r=new InputStreamReader(System.in);
		     BufferedReader br=new BufferedReader(r); 
		     System.out.println("Enter your string"); 
			  String inputString = null,line;
			  try {
				while((line = br.readLine()) != null){
				      if(line.isEmpty()){
				          break;
				      }
				      inputString += line + "\n";
				  }
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   stringOccurence.occurenceOfString(inputString);
	}

}
