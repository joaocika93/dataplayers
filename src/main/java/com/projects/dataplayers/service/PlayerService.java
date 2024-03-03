package com.projects.dataplayers.service;

import com.projects.dataplayers.domain.Player;
import com.projects.dataplayers.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public String save(Player player){
        playerRepository.save(player);
        return "Saved";
    }

}
