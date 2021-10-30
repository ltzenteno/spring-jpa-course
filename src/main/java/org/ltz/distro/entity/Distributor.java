package org.ltz.distro.entity;

import audit.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "distro_distributors")
@Entity
public class Distributor extends BaseEntity {

    private String name;

    @OneToOne
    private Address address;
}
