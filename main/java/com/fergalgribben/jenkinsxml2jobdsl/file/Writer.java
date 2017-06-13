package com.fergalgribben.jenkinsxml2jobdsl.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {
	
	private static final String JOB_DRIECTORY = "jobs";
	
	private static void makeJobsDirectory(){
		File dir = new File(JOB_DRIECTORY);
		if (!dir.exists()){
			dir.mkdirs();
		}
	}

	public static void writeToFile(final String file, final String contents) throws FileNotFoundException{
		makeJobsDirectory();
		System.out.println("Writing "+JOB_DRIECTORY+"/"+file+".groovy");
		PrintWriter out = new PrintWriter(JOB_DRIECTORY+"/"+file+".groovy");
		out.write(contents);
		out.close();
	}
}
