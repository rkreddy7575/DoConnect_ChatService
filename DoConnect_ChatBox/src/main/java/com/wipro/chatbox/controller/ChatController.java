package com.wipro.chatbox.controller;

mport java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.chatbox.dto.TextDto;
import com.wipro.chatbox.service.ChatServiceImp;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {
	@Autowired
	ChatServiceImp service;
	
	@GetMapping("/getMessages")
	public List<TextDto> getMessages(){
		return service.getMessages();	
	}
	
	@PostMapping("/addMessage")
	public TextDto postMessage(@RequestBody TextDto userMessage){
		return service.addmessage(userMessage);
	}
	

}
