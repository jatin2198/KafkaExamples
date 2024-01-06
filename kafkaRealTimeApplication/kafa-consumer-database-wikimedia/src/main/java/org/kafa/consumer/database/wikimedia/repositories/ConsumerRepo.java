package org.kafa.consumer.database.wikimedia.repositories;

import org.kafa.consumer.database.wikimedia.documents.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@EnableMongoRepositories
public interface ConsumerRepo extends JpaRepository<WikiMediaData, Integer> {

}
