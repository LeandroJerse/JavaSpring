package org.example.springProject.services;

import org.example.springProject.dto.GameMinDTO;
import org.example.springProject.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.springProject.repositories.GameRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){

        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());


    }
}
