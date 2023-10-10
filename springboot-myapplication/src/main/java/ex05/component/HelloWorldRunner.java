package ex05.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * MyApplication.java 에서 주석처리한 코드 대신 사용하는 방법
 */

@Component
public class HelloWorldRunner implements ApplicationRunner {
	@Autowired
	private MyComponent myComponent;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		myComponent.printHelloWorld();
	}

}
