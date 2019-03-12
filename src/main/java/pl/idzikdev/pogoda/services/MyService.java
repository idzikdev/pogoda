package pl.idzikdev.pogoda.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.idzikdev.pogoda.models.Weather;

@Service
public class MyService {


    public Weather getWeather(String cityName){
        String apiKey="";
        RestTemplate restTemplate=getRestTemplate();
        Weather weather=restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units=metric&appid="+apiKey,Weather.class);
        return weather;
    }


    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
