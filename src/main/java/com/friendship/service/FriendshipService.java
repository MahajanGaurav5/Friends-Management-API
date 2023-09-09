package com.friendship.service;

import com.friendship.entities.Friendship;

import java.util.List;

public interface FriendshipService
{
    public Friendship saveFriendData(Friendship friendship);
    public void deleteFriendData(Integer fid);

    public Friendship getOneFriendData(Integer fid);

    public List<Friendship> getAllFriends();


}
