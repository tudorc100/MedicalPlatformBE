package com.lab4.demo.model.mapper;

import com.lab4.demo.dtos.EntryDTO;
import com.lab4.demo.dtos.EntryDTO.EntryDTOBuilder;
import com.lab4.demo.model.Entry;
import com.lab4.demo.model.Entry.EntryBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-29T18:29:32+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 15.0.9 (Azul Systems, Inc.)"
)
@Component
public class DeviceMapperImpl implements DeviceMapper {

    @Override
    public EntryDTO toDto(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryDTOBuilder entryDTO = EntryDTO.builder();

        entryDTO.id( entry.getId() );
        entryDTO.description( entry.getDescription() );
        entryDTO.department( entry.getDepartment() );
        entryDTO.userId( entry.getUserId() );

        return entryDTO.build();
    }

    @Override
    public Entry fromDto(EntryDTO item) {
        if ( item == null ) {
            return null;
        }

        EntryBuilder entry = Entry.builder();

        entry.id( item.getId() );
        entry.description( item.getDescription() );
        entry.department( item.getDepartment() );
        entry.userId( item.getUserId() );

        return entry.build();
    }
}
