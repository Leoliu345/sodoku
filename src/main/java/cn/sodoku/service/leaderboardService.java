package cn.sodoku.service;

import cn.sodoku.Entity.Leaderboard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface leaderboardService {
    public List<Leaderboard> getLeaderboard(int puzzleid);
}
