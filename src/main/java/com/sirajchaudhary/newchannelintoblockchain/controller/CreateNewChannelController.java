package com.sirajchaudhary.newchannelintoblockchain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sirajchaudhary.newchannelintoblockchain.service.CreateNewChannelService;

@RestController
public class CreateNewChannelController {

	@Autowired
	CreateNewChannelService createNewChannelService;

	@PostMapping(value = "create-new-channel")
	public ResponseEntity<String> createNewChannel(@RequestParam String channelName, @RequestParam String networkPath) {

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("New-Channel-Name", channelName);
		
		if (createNewChannelService.createNewChannel(channelName, networkPath)) 
			return new ResponseEntity<>("CREATED NEW CHANNEL ", httpHeaders, HttpStatus.CREATED);
		
		return new ResponseEntity<>("EXCEPTION ", httpHeaders, HttpStatus.EXPECTATION_FAILED);
	}
}