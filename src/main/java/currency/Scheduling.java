package currency;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Scheduling {
    private static final Logger log = LoggerFactory.getLogger(Scheduling.class);
    RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 5000)
    public void reportTimeStamp() {
        CryptoBase cryptoBase = restTemplate.getForObject(
                "https://api.cryptonator.com/api/ticker/btc-usd", CryptoBase.class);
        log.info(cryptoBase.toString());
    }

}
