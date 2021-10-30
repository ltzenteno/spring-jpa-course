package org.ltz.distro.repository.specification;

import org.ltz.distro.entity.CategoryEnum;
import org.ltz.distro.entity.Product;
import org.ltz.distro.entity.StateEnum;
import org.ltz.distro.entity.metamodel.Address_;
import org.ltz.distro.entity.metamodel.Product_;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public final class ProductSpecifications {

    private ProductSpecifications() {}

    public static Specification<Product> nameLike(String name) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.like(
                        criteriaBuilder.lower(
                                root.get(Product_.NAME)
                        ), "%" + name.toLowerCase() + "%")
                );
    }

    public static Specification<Product> belongsToCategory(List<CategoryEnum> categories) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.in(root.get(Product_.CATEGORY)).value(categories)
                );
    }

    /**
     * Filters products where their manufacturing place is in the state of California and the price is greater
     * than 1000
     * @return Specification<Product>
     */
    public static Specification<Product> isPremium() {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.and(
                        criteriaBuilder.equal(
                                root.get(Product_.MANUFACTURING_PLACE).get(Address_.STATE),
                                StateEnum.CALIFORNIA
                        ),
                        criteriaBuilder.greaterThanOrEqualTo(
                                root.get(Product_.PRICE), 1000)
                        )
                );
    }
}
