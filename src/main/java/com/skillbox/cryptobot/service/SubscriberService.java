package com.skillbox.cryptobot.service;

import org.springframework.stereotype.Service;
import com.skillbox.cryptobot.client.Subscribers;

@Service
public class SubscriberService {

    public void addSubscriber(){
        Subscribers subscriber = new Subscribers();

        subscriber.setTelegramId(123);


    }
}
