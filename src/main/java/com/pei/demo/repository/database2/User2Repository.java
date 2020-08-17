package com.pei.demo.repository.database2;

import com.pei.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface User2Repository extends JpaRepository<User,Integer> {
}
