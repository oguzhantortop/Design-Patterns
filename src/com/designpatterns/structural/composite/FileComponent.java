package com.designpatterns.structural.composite;

public abstract class FileComponent {
	protected String fileComponentName;
	protected FileComponent parentComponent;
	
	public abstract void displayComponent();
	public abstract void addChildFileComponent(FileComponent fileComponent);
}
