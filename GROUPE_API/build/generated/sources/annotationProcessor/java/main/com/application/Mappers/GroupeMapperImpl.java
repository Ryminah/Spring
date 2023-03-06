package com.application.Mappers;

import com.application.dtos.GroupeDto;
import com.application.entities.Groupe;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T10:24:53+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class GroupeMapperImpl implements GroupeMapper {

    @Override
    public Groupe dtoToEntity(GroupeDto groupeDto) {
        if ( groupeDto == null ) {
            return null;
        }

        Groupe groupe = new Groupe();

        groupe.setId( groupeDto.getId() );
        groupe.setNom( groupeDto.getNom() );

        return groupe;
    }

    @Override
    public GroupeDto entityToDto(Groupe groupe) {
        if ( groupe == null ) {
            return null;
        }

        GroupeDto groupeDto = new GroupeDto();

        groupeDto.setId( groupe.getId() );
        groupeDto.setNom( groupe.getNom() );

        return groupeDto;
    }
}
