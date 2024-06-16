package com.song.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.domain.YourEntity;

@Mapper
public interface YourEntityMapper {
    List<YourEntity> findAll();
}