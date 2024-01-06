package org.kafa.consumer.database.wikimedia.documents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import org.springframework.stereotype.Component;


import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

//@Document(collation = "wikimedia_eventdata")
//@Component
@Entity
@Table(name="wikimedia_eventdata")
public class WikiMediaData {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column(name = "event_data",columnDefinition="TEXT", length = 2048)
	private String Event_data;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEvent_data() {
		return Event_data;
	}
	public void setEvent_data(String event_data) {
		Event_data = event_data;
	}

}
