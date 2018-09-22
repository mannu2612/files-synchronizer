package com.github.files_synchronizer.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;

import com.github.files_synchronizer.Synchronizer;

public class SynchronizerCLI {

	public static void main(String[] args) {

		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine line = parser.parse(CLIOptions.getOptions(), args);

			Synchronizer synchronizer = new Synchronizer();

			if (line.hasOption(CLIOptions.COPY)) {
				String src = line.getOptionValues(CLIOptions.COPY)[0];
				String dest = line.getOptionValues(CLIOptions.COPY)[1];
				if(synchronizer.syncAndCopyFromSourceToDest(src, dest)) {
					System.out.println("Synchronized and Copied from "+src+" to "+dest);
				}
				synchronizer.syncAndCopyFromSourceToDest(src, dest);
			} else if (line.hasOption(CLIOptions.MOVE)) {
				String src = line.getOptionValues(CLIOptions.MOVE)[0];
				String dest = line.getOptionValues(CLIOptions.MOVE)[1];				
				if(synchronizer.syncAndMoveFromSourceToDest(src, dest)) {
					System.out.println("Synchronized and Moved from "+src+" to "+dest);
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
