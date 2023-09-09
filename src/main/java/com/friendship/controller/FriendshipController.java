package com.friendship.controller;

import com.friendship.entities.Friendship;
import com.friendship.service.FriendshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FriendshipController
{
    @Autowired
    private FriendshipService friendshipService;

    @PostMapping("/save")
    public Friendship SaveFriend(@RequestBody Friendship friendship)
    {
       Friendship fs = friendshipService.saveFriendData(friendship);
       return fs;
    }

    @GetMapping("/get/{fid}")
    public Friendship GetOneFrienddata(@PathVariable Integer fid)
    {
        Friendship fd1=friendshipService.getOneFriendData(fid);
        return fd1;

    }

    @GetMapping("/getall")
    public List<Friendship> GetAllFriends()
    {
        List<Friendship> fs1= friendshipService.getAllFriends();
        return fs1;

    }

    @DeleteMapping("/delete/{fid}")
    public String deleteFriend(@PathVariable Integer fid)
    {
       friendshipService.deleteFriendData(fid);

       return "One Friend Data Deleted Successfully..";

    }

}
