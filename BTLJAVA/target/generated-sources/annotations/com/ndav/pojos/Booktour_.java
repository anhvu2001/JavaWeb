package com.ndav.pojos;

import com.ndav.pojos.Pay;
import com.ndav.pojos.Tour;
import com.ndav.pojos.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-22T15:10:40")
@StaticMetamodel(Booktour.class)
public class Booktour_ { 

    public static volatile SingularAttribute<Booktour, Tour> tourid;
    public static volatile SingularAttribute<Booktour, Pay> pay;
    public static volatile SingularAttribute<Booktour, Long> id;
    public static volatile SingularAttribute<Booktour, User> userid;

}