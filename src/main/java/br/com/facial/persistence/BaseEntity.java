package br.com.facial.persistence;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.domain.Persistable;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Persistable<UUID> {

	private static final long serialVersionUID = 5316703292482521312L;

	@Id
	@GeneratedValue
	@Column(updatable = false)
	private UUID id;

	@GeneratedValue
	private Long code;

	@Override
	public boolean isNew() {
		return id == null;
	}
}
