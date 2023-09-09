package com.friendship.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Friendship
{
    @Id
    @Column(name="id")
    private Integer fid;
    private String friendName;
    private String meetPlace;
    private Long meetYear;
    private String stayedTime;


}
