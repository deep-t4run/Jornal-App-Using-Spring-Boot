package com.parth.journalApp.cache;

import com.parth.journalApp.entity.ConfigJournalAppEntity;
import com.parth.journalApp.repository.ConfiJournalAppRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    @Autowired
    private ConfiJournalAppRepository confiJournalAppRepository;

    public Map<String, String> cache;

    @PostConstruct
    public void init(){
        cache = new HashMap<>();
        List<ConfigJournalAppEntity> all = confiJournalAppRepository.findAll();
        for(ConfigJournalAppEntity configJournalAppEntity : all){
            cache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
        }
    }
}
