package com.jrj.tougu.fragment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TouguFragmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouguFragmentApplication.class, args);
	}

	//    /**
	//     * 端口设置
	//     * @param container
	//     */
	//    @Override
	//    public void customize(ConfigurableEmbeddedServletContainer container) {
	//        container.setPort(8080);
	//    }

	/**
	 * 线程池
	 */
	@Bean
	protected ThreadPoolTaskExecutor mvcTaskExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setThreadNamePrefix("my-mvc-task-executor-");
		taskExecutor.setCorePoolSize(10);
		taskExecutor.setMaxPoolSize(30);
		return taskExecutor;
	}
}
