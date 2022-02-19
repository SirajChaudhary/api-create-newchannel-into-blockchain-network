package com.sirajchaudhary.newchannelintoblockchain.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class CreateNewChannelServiceImpl implements CreateNewChannelService {

	@Override
	public boolean createNewChannel(String channelName, String networkPath) {
		System.out.println(networkPath);

		String commandToExecute = "sudo ./network.sh createChannel -c " + channelName;

		System.out.println(commandToExecute);

		ProcessBuilder processBuilder = new ProcessBuilder();
		  processBuilder.directory(new File(networkPath));
		  processBuilder.command("sh", "-c", commandToExecute);
		  try {
			@SuppressWarnings("unused")
			Process process = processBuilder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		return true;
	}

}
