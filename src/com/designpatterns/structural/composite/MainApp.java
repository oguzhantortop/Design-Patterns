package com.designpatterns.structural.composite;

public class MainApp {

	public static void main(String[] args) {
		Folder rootFolder = new Folder("bin");
		FileComponent file = new File("hdfs.sh");
		FileComponent inputFolder = new Folder("input");
		rootFolder.addChildFileComponent(file);
		rootFolder.addChildFileComponent(inputFolder);
		rootFolder.displayComponent();
	}

}
