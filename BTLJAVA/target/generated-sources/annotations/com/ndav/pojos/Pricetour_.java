package com.ndav.pojos;

import com.ndav.pojos.Tour;
import com.ndav.pojos.Typecustomer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-22T15:10:40")
@StaticMetamodel(Pricetour.class)
public class Pricetour_ { 

    public static volatile SingularAttribute<Pricetour, Integer> price;
    public static volatile SingularAttribute<Pricetour, Tour> tourid;
    public static volatile SingularAttribute<Pricetour, Typecustomer> customerid;
    public static volatile SingularAttribute<Pricetour, Long> id;

}