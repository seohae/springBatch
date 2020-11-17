package com.study.batch.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "temp_library_local")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TempLibraryLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String bigLocal;

    private String smallLocal;

}
