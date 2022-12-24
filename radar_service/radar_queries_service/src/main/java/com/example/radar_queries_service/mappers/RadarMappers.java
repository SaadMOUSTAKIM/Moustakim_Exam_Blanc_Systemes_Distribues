package com.example.radar_queries_service.mappers;

import api.*;
import com.example.radar_queries_service.entities.OverSpeedDetection;
import com.example.radar_queries_service.entities.Radar;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RadarMappers {
    Radar from(RadarDTO radarDTO);
    RadarResponseDTO from(Radar radar);
    RadarOverSpeedsDTO fromRadar(Radar radar);
    OverSpeedDetection from(OverSpeedRequestDTO overSpeedRequestDTO);
    OverSpeedResponseDTO fromOS(OverSpeedDetection overSpeedRequest);
}
