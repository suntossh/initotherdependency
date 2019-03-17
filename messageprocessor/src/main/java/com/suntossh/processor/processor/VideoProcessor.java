package com.suntossh.processor.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohan.processor.dao.ProcessorDAO;
import com.rohan.processor.service.ProcessorFactory;

@Component("VideoProcessor")
public class VideoProcessor implements ProcessorInterface{

	Logger logger = LoggerFactory.getLogger(VideoProcessor.class);

	@Autowired
	ProcessorFactory processorFactory;
	
	@Override
	public boolean validate(String content) {
		logger.info("validate video :"+content);
		ProcessorDAO videoDAO = processorFactory.getProcessorDAO("V");
		videoDAO.validate(content);
		return true;
	}

	@Override
	public void persist(String content) {
		logger.info("persist video :"+content);
		ProcessorDAO videoDAO = processorFactory.getProcessorDAO("V");
		videoDAO.persist(content);
	}

}
