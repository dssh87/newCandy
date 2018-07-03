package org.candy.service;

import org.candy.mapper.FreeboardMapperTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class FreeboardServiceTests {

	@Setter(onMethod_= {@Autowired})
	private FreeboardService service;
	
	@Test
	public void getRead() {
		log.info(service.read(3));
	}
	
}
