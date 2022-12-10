package io.renren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@MapperScan("io.renren.dao")
public class RenrenApplication {
	public static String mainPath = "";
	public static String package_ = "";
	public static String moduleName = "";

	public static void main(String[] args) {

		if(args.length < 3){
			System.out.println("Please give correct parameters: java -jar renren-generator-1.0.0.jar mainPath package moduleName");
			System.out.println(" java -jar renren-generator-1.0.0.jar com.cloudDns.web com.cloudDns.web.api cloudDns  ");
			System.exit(0);
		}
		mainPath = args[0];
		package_ = args[1];
		moduleName = args[2];
		System.out.println("mainPath args[0]:"+mainPath);
		System.out.println("package_ args[1]:"+package_);
		System.out.println("moduleName args[2]:"+moduleName);
		System.out.println("Example: java -jar renren-generator-1.0.0.jar mainPath package moduleName ");
		System.out.println(" java -jar renren-generator-1.0.0.jar com.cloudDns.web com.cloudDns.web.api cloudDns ");

		SpringApplication.run(RenrenApplication.class, args);
	}
}
