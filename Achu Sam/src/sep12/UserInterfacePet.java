package sep12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class UserInterfacePet {
	public int countVowels(String name) {
		char[] ch=name.toCharArray();
		for(char c:ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
	}
	public String findPetName(String fileName){
		try(FileReader fr=new FileReader(fileName);BufferedReader br= new BufferedReader(fr)){
			String line="";
			while(line=br.readLine()=!null) {
				if(countVowels(line)==1) {
					result+=line+"\n"
				}
			}
			}
		catch(FileNotFoundException e) {
			System.out.println("Please Give the Correct file name");
		}
		catch(IOException e) {
			System.out.println("Error Occur while reading the names from the file");
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		findPetName("C:\\Users\\Default\\petnames.txt")
	}
}
