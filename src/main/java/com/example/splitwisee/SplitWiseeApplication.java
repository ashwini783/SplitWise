package com.example.splitwisee;

import com.example.splitwisee.command.CommandExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaAuditing
public class SplitWiseeApplication implements CommandLineRunner {
	@Autowired
    CommandExecutor commandExecutor;

	private Scanner scn=new Scanner(System.in);


	@Override
	public void run(String... args) throws Exception {
        while(true){
			System.out.print("Enter command: ");
			String command = scn.nextLine();
			commandExecutor.execute(command);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SplitWiseeApplication.class, args);
	}


}
