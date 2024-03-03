package com.projects.dataplayers.controller;

import com.projects.dataplayers.domain.Player;
import com.projects.dataplayers.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/save")
    public String save(@RequestBody Player player){
        return playerService.save(player);
    }


}
