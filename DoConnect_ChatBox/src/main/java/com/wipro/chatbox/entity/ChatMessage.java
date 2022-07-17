package com.wipro.chatbox.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Table(name="ChatBox")

public class ChatMessage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ChatMessage(String message) {
	
		this.message = message;
	}
	
}

