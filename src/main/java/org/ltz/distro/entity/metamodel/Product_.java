package org.ltz.distro.entity.metamodel;

import org.ltz.distro.entity.Address;
import org.ltz.distro.entity.CategoryEnum;
import org.ltz.distro.entity.Product;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Generated(value = "org.hibernate.jpamodelgen.JpaMetaModelProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, BigDecimal> price;
    public static volatile SingularAttribute<Product, LocalDateTime> manufacturingDate;
    public static volatile SingularAttribute<Product, CategoryEnum> category;
    public static volatile SingularAttribute<Product, Address> manufacturingPlace;

    public static final String NAME = "name";
    public static final String PRICE = "price";
    public static final String MANUFACTURING_DATE = "manufacturingDate";
    public static final String CATEGORY = "category";
    public static final String MANUFACTURING_PLACE = "manufacturingPlace";

}
