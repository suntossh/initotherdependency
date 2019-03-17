package com.suntossh.processor.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohan.processor.dao.ProcessorDAO;
import com.rohan.processor.service.ProcessorFactory;

@Component("ImageProcessor")
public class ImageProcessor implements ProcessorInterface{

	Logger logger = LoggerFactory.getLogger(ImageProcessor.class);
	
	@Autowired
	ProcessorFactory processorFactory;
	
	@Override
	public boolean validate(String content) {
		logger.info("validate image :"+content);
		ProcessorDAO imageDAO = processorFactory.getProcessorDAO("I");
		imageDAO.validate(content);
		return true;
	}

	@Override
	public void persist(String content) {
		logger.info("persist image :"+content);
		ProcessorDAO imageDAO = processorFactory.getProcessorDAO("I");
		imageDAO.persist(content);
	}

}
