package org.ltz.distro.entity;

import audit.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "distro_addresses")
@Entity
public class Address extends BaseEntity {

    private String line1;
    private String line2;
    private String city;

    @Enumerated(EnumType.STRING)
    private StateEnum state;

    private String pinCode;

}
