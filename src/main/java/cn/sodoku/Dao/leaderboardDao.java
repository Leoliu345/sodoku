package cn.sodoku.Dao;

import cn.sodoku.Entity.Leaderboard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface leaderboardDao {
    public List<Leaderboard> getLeaderboard(int puzzleid);
}
