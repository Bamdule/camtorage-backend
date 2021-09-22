package com.camtorage.db.user.repository;

import com.camtorage.entity.user.UserResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

import java.util.Optional;

import static com.camtorage.entity.user.QUser.user;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    private EntityManager em;

    @Override
    public Optional<UserResponse> getUserById(Integer id) {

        JPAQueryFactory query = new JPAQueryFactory(em);

        return Optional.ofNullable(query
                .select(Projections.bean(
                        UserResponse.class,
                        user.id,
                        user.name,
                        user.email,
                        user.phone,
                        user.isPublic.as("isPublic"),
                        user.image.id.as("userImageId"),
                        user.image.path.as("userImagePath")
                ))
                .from(user)
                .leftJoin(user.image)
                .where(user.id.eq(id))
                .fetchOne())
                ;

    }
}
