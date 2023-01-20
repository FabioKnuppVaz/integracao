package app.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import app.pojos.Cidade;
import app.pojos.Cidades;

@Service
public class InpeServices {

	@Value("${inpe.url}")
	private String inpeUrl;
	
	private RestTemplate restTemplate;

    public InpeServices(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public Cidades getLocalidade(String localidade) {
        String url = inpeUrl + "/listaCidades?city=" + localidade;
        return restTemplate.getForObject(url, Cidades.class);
    }

    public Cidade getPrevisao4Dias(String id) {
        String url = inpeUrl + "/cidade/" + id + "/previsao.xml";
        return restTemplate.getForObject(url, Cidade.class);    	
    }
    
    public Cidade getPrevisao7Dias(String id) {
        String url = inpeUrl + "/cidade/7dias/" + id + "/previsao.xml";
        return restTemplate.getForObject(url, Cidade.class);    	
    }

	public Cidade getPrevisaoExtendida(String id) {
		String url = inpeUrl + "/cidade/" + id + "/estendida.xml";
        return restTemplate.getForObject(url, Cidade.class); 
	}


}
