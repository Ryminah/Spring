package com.application.Mappers;

import com.application.dtos.ArtisteDto;
import com.application.entities.Artiste;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T10:24:53+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class ArtisteMapperImpl implements ArtisteMapper {

    @Override
    public ArtisteDto entityToDto(Artiste artiste) {
        if ( artiste == null ) {
            return null;
        }

        ArtisteDto artisteDto = new ArtisteDto();

        artisteDto.setId( artiste.getId() );
        artisteDto.setNom( artiste.getNom() );
        artisteDto.setPrenom( artiste.getPrenom() );
        artisteDto.setPseudo( artiste.getPseudo() );
        artisteDto.setVille( artiste.getVille() );
        artisteDto.setAge( artiste.getAge() );
        artisteDto.setGroupeId( artiste.getGroupeId() );

        return artisteDto;
    }

    @Override
    public Artiste dtoToEntity(ArtisteDto artisteDto) {
        if ( artisteDto == null ) {
            return null;
        }

        Artiste artiste = new Artiste();

        artiste.setId( artisteDto.getId() );
        artiste.setNom( artisteDto.getNom() );
        artiste.setPrenom( artisteDto.getPrenom() );
        artiste.setPseudo( artisteDto.getPseudo() );
        artiste.setVille( artisteDto.getVille() );
        artiste.setAge( artisteDto.getAge() );
        artiste.setGroupeId( artisteDto.getGroupeId() );

        return artiste;
    }
}
