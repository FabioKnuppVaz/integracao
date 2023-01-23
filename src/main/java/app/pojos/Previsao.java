package app.pojos;

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
@XmlRootElement(name = "previsao")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonSerialize
public class Previsao {

	@XmlElement(name = "dia")
	String dia;
	
	@XmlElement(name = "tempo")
	String tempo;
	
	@XmlElement(name = "maxima")
	String maxima;
	
	@XmlElement(name = "minima")
	String minima;
	
	@XmlElement(name = "iuv")
	String iuv;
	
}
