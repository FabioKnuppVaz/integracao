package app.pojos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "cidades")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cidades {
	
	@XmlElement(name = "cidade")
	List<Cidade> cidades;

}
