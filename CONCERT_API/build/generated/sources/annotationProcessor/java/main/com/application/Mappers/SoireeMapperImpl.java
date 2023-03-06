package com.application.Mappers;

import com.application.dtos.SoireeDto;
import com.application.entities.Soiree;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T10:24:54+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class SoireeMapperImpl implements SoireeMapper {

    @Override
    public SoireeDto soireeToSoireeDto(Soiree soiree) {
        if ( soiree == null ) {
            return null;
        }

        SoireeDto soireeDto = new SoireeDto();

        soireeDto.setId( soiree.getId() );
        soireeDto.setNom( soiree.getNom() );
        soireeDto.setSalleId( soiree.getSalleId() );

        return soireeDto;
    }

    @Override
    public Soiree soireeDtoToSoiree(SoireeDto soireeDto) {
        if ( soireeDto == null ) {
            return null;
        }

        Soiree soiree = new Soiree();

        soiree.setId( soireeDto.getId() );
        soiree.setNom( soireeDto.getNom() );
        soiree.setSalleId( soireeDto.getSalleId() );

        return soiree;
    }
}
