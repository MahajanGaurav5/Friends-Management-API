package com.friendship.repository;

import com.friendship.entities.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrienshipRepo extends JpaRepository<Friendship,Integer>
{

}
