package com.application.Mappers;

import com.application.dtos.ConcertDto;
import com.application.entities.Concert;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T10:24:54+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class ConcertMapperImpl implements ConcertMapper {

    @Override
    public Concert dtoToEntity(ConcertDto concertConDto) {
        if ( concertConDto == null ) {
            return null;
        }

        Concert concert = new Concert();

        concert.setDebut( concertConDto.getDebut() );
        concert.setFin( concertConDto.getFin() );
        concert.setSoiId( concertConDto.getSoiId() );
        concert.setGrpId( concertConDto.getGrpId() );

        return concert;
    }

    @Override
    public ConcertDto entityToDto(Concert concertConEntity) {
        if ( concertConEntity == null ) {
            return null;
        }

        ConcertDto concertDto = new ConcertDto();

        concertDto.setId( concertConEntity.getId() );
        concertDto.setDebut( concertConEntity.getDebut() );
        concertDto.setFin( concertConEntity.getFin() );
        concertDto.setSoiId( concertConEntity.getSoiId() );
        concertDto.setGrpId( concertConEntity.getGrpId() );

        return concertDto;
    }
}
