package com.huh.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 集合注入
 *
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("coll.xml");
        CollectionInject collectionInject = (CollectionInject) ac.getBean("collectionInject");
        System.out.println(collectionInject.getMyList());
        System.out.println(collectionInject.getMySet());
        System.out.println(collectionInject.getMyMap());
        System.out.println(collectionInject.getMyProp());

    }

}
