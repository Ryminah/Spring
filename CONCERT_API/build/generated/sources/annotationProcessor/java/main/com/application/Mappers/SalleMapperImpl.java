package com.application.Mappers;

import com.application.dtos.SalleDto;
import com.application.entities.Salle;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T10:24:54+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class SalleMapperImpl implements SalleMapper {

    @Override
    public SalleDto salleToDto(Salle salle) {
        if ( salle == null ) {
            return null;
        }

        SalleDto.SalleDtoBuilder salleDto = SalleDto.builder();

        salleDto.id( salle.getId() );
        salleDto.nom( salle.getNom() );
        salleDto.adresse( salle.getAdresse() );
        salleDto.capacite( salle.getCapacite() );
        salleDto.gestion( salle.getGestion() );
        salleDto.asso( salle.getAsso() );
        salleDto.president( salle.getPresident() );

        return salleDto.build();
    }

    @Override
    public Salle dtoToSalle(SalleDto salleDto) {
        if ( salleDto == null ) {
            return null;
        }

        Salle.SalleBuilder salle = Salle.builder();

        salle.id( salleDto.getId() );
        salle.nom( salleDto.getNom() );
        salle.adresse( salleDto.getAdresse() );
        salle.capacite( salleDto.getCapacite() );
        salle.gestion( salleDto.getGestion() );
        salle.asso( salleDto.getAsso() );
        salle.president( salleDto.getPresident() );

        return salle.build();
    }
}
