package cn.sodoku.service.impl;

import cn.sodoku.Dao.leaderboardDao;
import cn.sodoku.Entity.Leaderboard;
import cn.sodoku.service.leaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class leaderboardImpl implements leaderboardService {
    @Autowired
    leaderboardDao leaderboardDao;
    @Override
    public List<Leaderboard> getLeaderboard(int puzzleid) {
        return leaderboardDao.getLeaderboard(puzzleid);
    }
}
