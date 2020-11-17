package com.study.batch.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "temp_library_type")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TempLibraryType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String libraryType;



}
