package com.study.batch.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "temp_library")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TempLibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String libraryNm;

    private String bigLocal;

    private String smallLocal;

    private String libraryType;

}
