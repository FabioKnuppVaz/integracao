package app.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import app.pojos.Cidade;
import app.pojos.Cidades;

@Service
public class InpeServices {

	private final RestTemplate restTemplate;

    public InpeServices(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Cidades getLocalidade(String localidade) {
        String url = "http://servicos.cptec.inpe.br/XML/listaCidades?city=" + localidade;
        return this.restTemplate.getForObject(url, Cidades.class);
    }

    public Cidade getPrevisao4Dias(String id) {
        String url = "http://servicos.cptec.inpe.br/XML/cidade/" + id + "/previsao.xml";
        return this.restTemplate.getForObject(url, Cidade.class);    	
    }
    
    public Cidade getPrevisao7Dias(String id) {
        String url = "http://servicos.cptec.inpe.br/XML/cidade/7dias/" + id + "/previsao.xml";
        return this.restTemplate.getForObject(url, Cidade.class);    	
    }

	public Cidade getPrevisaoExtendida(String id) {
		String url = "http://servicos.cptec.inpe.br/XML/cidade/" + id + "/estendida.xml";
        return this.restTemplate.getForObject(url, Cidade.class); 
	}


}
