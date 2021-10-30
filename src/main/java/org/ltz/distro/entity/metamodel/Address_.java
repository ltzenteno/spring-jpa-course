package org.ltz.distro.entity.metamodel;

import org.ltz.distro.entity.Address;
import org.ltz.distro.entity.StateEnum;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JpaMetaModelProcessor")
@StaticMetamodel(Address.class)
public class Address_ {

    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> pinCode;
    public static volatile SingularAttribute<Address, StateEnum> state;

    public static final String CITY = "city";
    public static final String PIN_CODE = "pinCode";
    public static final String STATE = "state";
}
