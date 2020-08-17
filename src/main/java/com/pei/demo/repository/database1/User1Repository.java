package com.pei.demo.repository.database1;

import com.pei.demo.entity.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface User1Repository extends JpaRepository<User,Integer> {
}
