package com.restop.gateway.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.restop.gateway.dtos.SpotDTO;
import com.restop.gateway.entity.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotService {

    @Autowired
    DynamoDBMapper mapper;

    public SpotDTO getSpot(SpotDTO spotDTO) {
        Spot spot = mapper.load(Spot.class, spotDTO.getTitle());
        return convertSpot(spot);
    }

    public SpotDTO insertIntoSpot(SpotDTO spotDTO) {
        Spot spot = new Spot();
        spot.setTitle(spotDTO.getTitle());
        spot.setPosition(spotDTO.getPosition());
        spot.setIcon(spot.getIcon());
        mapper.save(spot);
        return convertSpot(spot);
    }

    public SpotDTO updateSpot(SpotDTO spotDTO){
        Spot updateSpot = mapper.load(Spot.class, spotDTO.getTitle());

        updateSpot.setPosition(spotDTO.getPosition());
        updateSpot.setIcon(spotDTO.getIcon());
        mapper.save(updateSpot);

        return convertSpot(updateSpot);
    }

    public SpotDTO deleteUser(SpotDTO spotDTO){
        Spot deleteSpot = mapper.load(Spot.class, spotDTO.getTitle());

        mapper.delete(deleteSpot);

        return convertSpot(deleteSpot);
    }

    public SpotDTO convertSpot(Spot spot) {
        return new SpotDTO(
                spot.getTitle(),
                spot.getPosition(),
                spot.getIcon()
        );
    }
}
