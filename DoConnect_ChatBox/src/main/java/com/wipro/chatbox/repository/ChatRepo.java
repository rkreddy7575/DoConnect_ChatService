package com.wipro.chatbox.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public class ChatRepo extends JpaRepositoriesAutoConfiguration{
	 List<Message> findAll();
}
