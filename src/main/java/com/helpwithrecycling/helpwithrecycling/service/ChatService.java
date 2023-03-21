package com.helpwithrecycling.helpwithrecycling.service;

import com.helpwithrecycling.helpwithrecycling.data.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public record ChatService(ChatRepository chatRepository) {
}
