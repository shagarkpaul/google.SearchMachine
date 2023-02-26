package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCsv {
	
	public String email;
	public String password;
	
	public static final String csvfile = "./src/test/jav/user.csv";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readCsv rc = new readCsv();
		
		rc.readCredentials("paul1");

	}
	
	public void readCredentials( String customer) {
		
			String line;  // store the whole line 
			String delimitter = ","; // will divide the line into username and password
			
		try(BufferedReader br = new BufferedReader(new FileReader(csvfile))){
			
		System.out.println("abcdeffffff");
			
			while((line = br.readLine()) != null ) {
				
				String[] userLine = line.split(delimitter);
				
				if(userLine[2].equals(customer)) {
					
					email = userLine[0];
					password = userLine[1];
					System.out.println(email);
					System.out.println(password);
				}
			}
		}
		catch(IOException e) {
			System.out.println("File not find");
		}
			
		}
		
		
	}



