package com.helpwithrecycling.helpwithrecycling.service;

import com.helpwithrecycling.helpwithrecycling.data.repository.GarbageRepository;
import org.springframework.stereotype.Service;

@Service
public record GarbageService(GarbageRepository garbageRepository) {

    public boolean hasId(final long id) {
        return garbageRepository.existsById(id);
    }
}
