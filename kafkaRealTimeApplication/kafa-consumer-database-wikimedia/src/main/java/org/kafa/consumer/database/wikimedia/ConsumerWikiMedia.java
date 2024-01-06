package org.kafa.consumer.database.wikimedia;

//import org.kafka.producer.wikimedia.KafkaProducerWiki;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableMongoRepositories
public class ConsumerWikiMedia 
{
    public static void main( String[] args )
    {
        ///System.out.println( "Hello World!" );
    	SpringApplication.run(ConsumerWikiMedia.class, args);
    }
    
    
    
}
