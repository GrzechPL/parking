package com.capgemini.parkingApp.dao.impl;

import com.capgemini.parkingApp.dao.UserRepositoryCustom;
import com.capgemini.parkingApp.entity.User;
import com.capgemini.parkingApp.entity.QUser;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> orderByLastName() {

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QUser user = QUser.user;

        return queryFactory.selectFrom(user)
                .where(user.id.between(2,5))
                .orderBy(user.lastName.desc())
                .fetch();
    }
}
