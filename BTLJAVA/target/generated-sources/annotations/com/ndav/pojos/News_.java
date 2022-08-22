package com.ndav.pojos;

import com.ndav.pojos.Commentnews;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-22T15:10:40")
@StaticMetamodel(MyNews.class)
public class News_ { 

    public static volatile SingularAttribute<MyNews, String> image;
    public static volatile SingularAttribute<MyNews, String> name;
    public static volatile SetAttribute<MyNews, Commentnews> commentnewsSet;
    public static volatile SingularAttribute<MyNews, Long> id;
    public static volatile SingularAttribute<MyNews, String> describe;
    public static volatile SingularAttribute<MyNews, String> title;

}