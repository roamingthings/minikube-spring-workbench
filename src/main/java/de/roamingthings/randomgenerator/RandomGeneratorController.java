package de.roamingthings.randomgenerator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@RestController
public class RandomGeneratorController {
    private static Random random = new Random();

    private static UUID id = UUID.randomUUID();

    @RequestMapping(value = "/random", produces = "application/json")
    public Map getRandomNumber() {
        Map ret = new HashMap();
        ret.put("random", random.nextInt());
        ret.put("id", id.toString());
        return ret;
    }
}
