package com.datastructure.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
		MidSquareHashing msh = new MidSquareHashing();
		int result = msh.midSquareHashingFunc(120);

		System.out.println(result);
	}

}
