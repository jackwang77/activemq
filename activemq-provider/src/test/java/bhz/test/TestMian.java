package bhz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bhz.entity.Mail;
import bhz.mq.MQProducer;

public class TestMian {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		MQProducer mqProducer = applicationContext.getBean(MQProducer.class);
		
		Mail mail = new Mail();
		mail.setTo("525635087@qq.com");
		mail.setSubject("异步发送邮件");
		mail.setContent("Hi,This is a message!");
														
		mqProducer.sendMessage(mail);
		System.out.println("发送成功..");		

	}

}
