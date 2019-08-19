package com.dzkj.test;



import org.apache.log4j.Logger;
import org.junit.Test;

import com.dzkj.HelloWord.HelloWord;

public class test {
    @Test
    public void testHW(){
    	
    	Logger log = Logger.getLogger(test.class);
    	log.debug(new HelloWord().print());
    }
}
