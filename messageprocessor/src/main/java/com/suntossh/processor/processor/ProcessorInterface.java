package com.suntossh.processor.processor;

public interface ProcessorInterface {
	
	public boolean validate(String content);
	
	public void persist(String content);
	
}
