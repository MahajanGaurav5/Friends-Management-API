package com.friendship.service;

import com.friendship.entities.Friendship;
import com.friendship.repository.FrienshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FriendshipServiceImpl implements FriendshipService
{

    @Autowired
    private FrienshipRepo frienshipRepo;
    @Override
    public Friendship saveFriendData(Friendship friendship)
    {
        Friendship f1=frienshipRepo.save(friendship);
        return f1;
    }

    @Override
    public void deleteFriendData(Integer fid)
    {
        Optional<Friendship> op=frienshipRepo.findById(fid);
        if(op.isPresent())
           frienshipRepo.deleteById(fid);
        else
            Optional.empty();



    }

    @Override
    public Friendship getOneFriendData(Integer fid) {

        Friendship s2=frienshipRepo.findById(fid).get();
        return s2;


    }

    @Override
    public List<Friendship> getAllFriends() {

        List<Friendship> frnds=frienshipRepo.findAll();
        return frnds;


    }


}
