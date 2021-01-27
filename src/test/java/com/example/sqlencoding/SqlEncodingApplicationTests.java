package com.example.sqlencoding;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SqlEncodingApplicationTests {
    @Autowired
    private TableRepository repo;

	@Test
	void checkValues() {
	    Optional<TableEntity> entity = repo.findById(1L);
	    assertThat(entity).isNotEmpty();
	    assertThat(entity.get().getName()).isEqualTo("French é, German ß, Icelandic þ, Esperanto ŭ");
	}

}
