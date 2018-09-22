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
				synchronizer.syncAndCopyFromSourceToDest(src, dest);
			} else if (line.hasOption(CLIOptions.MOVE)) {
				String src = line.getOptionValues(CLIOptions.MOVE)[0];
				String dest = line.getOptionValues(CLIOptions.MOVE)[1];
				synchronizer.syncAndMoveFromSourceToDest(src, dest);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
