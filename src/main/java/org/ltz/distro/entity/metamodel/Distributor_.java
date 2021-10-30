package org.ltz.distro.entity.metamodel;

import org.ltz.distro.entity.Address;
import org.ltz.distro.entity.Distributor;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JpaMetaModelProcessor")
@StaticMetamodel(Distributor.class)
public abstract class Distributor_ {

    public static volatile SingularAttribute<Distributor, Address> address;
    public static volatile SingularAttribute<Distributor, String> name;
    public static volatile SingularAttribute<Distributor, Long> id;

    public static final String ADDRESS = "address";
    public static final String NAME = "name";
    public static final String ID = "id";
}
