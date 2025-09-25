package com.skillbox.cryptobot.client;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Subscribers")
@Data
public class Subscribers {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "telegram_id", nullable = false)
    private int telegramId;

    private float price;
}
