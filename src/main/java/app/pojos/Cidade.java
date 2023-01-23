package app.pojos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "cidade")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonSerialize
public class Cidade {
	
	@XmlElement(name = "nome")
	String nome;
	
	@XmlElement(name = "uf")
	String uf;
	
	@XmlElement(name = "id")
	String id;

	@XmlElement(name = "atualizacao")
	String atualizacao;
	
	@XmlElement(name = "previsao")
	List<Previsao> previsao;

}
