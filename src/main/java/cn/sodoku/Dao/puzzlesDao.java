package cn.sodoku.Dao;

import cn.sodoku.Entity.Puzzle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface puzzlesDao {
    public int add(Puzzle puzzle);
    public Puzzle getPuzzle(int id);
}
