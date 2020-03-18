package es.ucm.fdi.iw.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A message that users can send each other.
 *
 * @author mfreire
 */
@Entity
public class Message {
	
	private static Logger log = LogManager.getLogger(Message.class);	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(targetEntity = User.class)
	private User sender;
	@ManyToOne(targetEntity = User.class)
	private User recipient;
	private String text;
	
	private LocalDateTime dateSent;
	private LocalDateTime dateRead;

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getDateSent() {
		return dateSent;
	}

	public void setDateSent(LocalDateTime dateSent) {
		this.dateSent = dateSent;
	}

	public LocalDateTime getDateRead() {
		return dateRead;
	}

	public void setDateRead(LocalDateTime dateRead) {
		this.dateRead = dateRead;
	}	
}
