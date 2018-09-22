package com.github.files_synchronizer.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CLIOptions {
	
	public static final String COPY = "c";
	public static final String MOVE = "m";
	
	public static Options getOptions() {
		Options options = new Options();
		Option copyOption = Option.builder(COPY).hasArg().longOpt("copy").numberOfArgs(2).build();
		Option moveOption = Option.builder(MOVE).hasArg().longOpt("move").numberOfArgs(2).build();
		options.addOption(copyOption);
		options.addOption(moveOption);
		return options;
	}

}
