package com.suntossh.processor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suntossh.processor.model.MediaVO;
import com.suntossh.processor.processor.ProcessorInterface;

@RestController
public class MediaProcessController {

	Logger logger = LoggerFactory.getLogger(MediaProcessController.class);

	@Qualifier("ImageProcessor")
	@Autowired
	ProcessorInterface imageProcessor;
	
	@Qualifier("VideoProcessor")
	@Autowired
	ProcessorInterface videoProcessor;
	
	
	
	@GetMapping("/video")
	public MediaVO addVideo(@RequestParam(name = "vId") String videoId){
		logger.info("Processing video in MediaProcessController");
		System.out.println("Processing video in MediaProcessController");
		videoProcessor.validate(videoId);
		return new MediaVO("Good Video");
	}
	
	@GetMapping("/image")
	public MediaVO addImage(@RequestParam(name = "iId") String imgId){
		logger.info("Processing image in MediaProcessController");
		imageProcessor.validate(imgId);
		return new MediaVO("Good Image");
	}
}