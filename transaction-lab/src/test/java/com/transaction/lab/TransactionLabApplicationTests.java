package com.transaction.lab;

import com.transaction.lab.app.TransactionLabApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TransactionLabApplication.class)
@WebAppConfiguration
public class TransactionLabApplicationTests {

	@Test
	public void contextLoads() {
	}

}
