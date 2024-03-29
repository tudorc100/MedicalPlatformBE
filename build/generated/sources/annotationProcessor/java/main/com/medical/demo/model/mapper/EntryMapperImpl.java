package com.medical.demo.model.mapper;

import com.medical.demo.dtos.EntryDTO;
import com.medical.demo.dtos.EntryDTO.EntryDTOBuilder;
import com.medical.demo.model.Entry;
import com.medical.demo.model.Entry.EntryBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-04T19:48:41+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 15.0.9 (Azul Systems, Inc.)"
)
@Component
public class EntryMapperImpl implements EntryMapper {

    @Override
    public EntryDTO toDto(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryDTOBuilder entryDTO = EntryDTO.builder();

        entryDTO.id( entry.getId() );
        entryDTO.title( entry.getTitle() );
        entryDTO.description( entry.getDescription() );
        entryDTO.department( entry.getDepartment() );
        entryDTO.entryDate( entry.getEntryDate() );
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
        entry.title( item.getTitle() );
        entry.description( item.getDescription() );
        entry.department( item.getDepartment() );
        entry.entryDate( item.getEntryDate() );
        entry.userId( item.getUserId() );

        return entry.build();
    }
}
