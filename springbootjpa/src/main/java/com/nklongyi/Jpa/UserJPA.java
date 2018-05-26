package com.nklongyi.Jpa;

import com.nklongyi.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by longyi on 2018-05-26.
 */
public interface UserJPA extends JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>,Serializable {
}
