package com.ndav.pojos;

import com.ndav.pojos.MyNews;
import com.ndav.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-22T15:10:40")
@StaticMetamodel(Commentnews.class)
public class Commentnews_ { 

    public static volatile SingularAttribute<Commentnews, MyNews> newsid;
    public static volatile SingularAttribute<Commentnews, Date> createddate;
    public static volatile SingularAttribute<Commentnews, Long> id;
    public static volatile SingularAttribute<Commentnews, User> userid;
    public static volatile SingularAttribute<Commentnews, String> content;

}