package midassignment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class PlayPlay {

	static ArrayList<String> playlist;
	String sn = "";
	
	OutputStream out = null;
	BufferedOutputStream bout = null;
	ObjectInputStream oout = null;
	
	InputStream in = null;
	BufferedInputStream bin = null;
	ObjectInputStream oin = null;
	
	private PlayPlay() {}
    private static PlayPlay instance = null;
    public static PlayPlay getInstance() {
        if (instance == null) {
            instance = new PlayPlay();
            playlist = new ArrayList<String>();
        }
        return instance;
    }

	void writeSongName() throws Exception{
		/*
		out = new FileInputStream("output.txt");
		bout = new BufferedInputStream(out);
		oout = new ObjectInputStream(bout);
		
		ArrayList<String> list = (ArrayList<String>)oin.readObject();
		for(String str : list) {
			System.out.println(list.get(str));
		*/
		
		Scanner inCommand = new Scanner(System.in);
		String cont = "yes";

        while (cont.compareTo("yes")==0) {
        	System.out.println("노래 제목 입력 : ");
    		sn = inCommand.next();
    		playlist.add(sn);
    		
    		System.out.println("Continue? (yes/no)");
    		cont = inCommand.next();
    		// inCommand.close();
		// https://stackoverflow.com/questions/15398703/exception-in-thread-main-java-util-nosuchelementexception
    		
        }
		
        
	}
	
	void saveSongName() throws Exception{
		System.out.println("다시 저장할 시, 그 전에 적었던 목록은 사라집니다.");
		FileWriter writer = new FileWriter("output.txt");
		for(String str : playlist) {
			writer.write(str);
		}
		System.out.println("목록 저장이 완료되었습니다.");
		writer.close();
		//https://stackoverflow.com/questions/6548157/how-to-write-an-arraylist-of-strings-into-a-text-file
	}
	
	void readSongName() throws Exception {
		/*
		in = new FileInputStream("output.txt");
		bin = new BufferedInputStream(in);
		oin = new ObjectInputStream(bin);
		
		ArrayList<String> list = (ArrayList<String>)oin.readObject();
		for(String str : list) {
			System.out.println(list.get(str));
		*/
		
		ArrayList<String> result = new ArrayList<>();
		 
		try (FileReader f = new FileReader("output.txt")) {
		    StringBuffer sb = new StringBuffer();
		    while (f.ready()) {
		        char c = (char) f.read();
		        if (c == '\n') {
		            result.add(sb.toString());
		            sb = new StringBuffer();
		        } else {
		            sb.append(c);
		        }
		    }
		    if (sb.length() > 0) {
		        result.add(sb.toString());
		    }
		}       
		
		Collections.shuffle(result);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println("");
		
		/*
		Collections.shuffle(playlist);
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		*/
		}
	}
	
	
}
