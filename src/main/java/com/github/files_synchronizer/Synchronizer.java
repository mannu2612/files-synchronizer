package com.github.files_synchronizer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Synchronizer {

	public boolean syncAndCopyFromSourceToDest(String src, String dest) {
		File source = new File(src);
		File destination = new File(dest);
		try {
			FileUtils.copyDirectory(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean syncAndMoveFromSourceToDest(String src, String dest){
		if(syncAndCopyFromSourceToDest(src, dest)) {
			FileUtils.deleteQuietly(new File(src));
		}
		return true;
	}
}
