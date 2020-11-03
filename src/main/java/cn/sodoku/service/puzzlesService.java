package cn.sodoku.service;

import cn.sodoku.Entity.Puzzle;
import org.springframework.stereotype.Service;

@Service
public interface puzzlesService {
    public int add(Puzzle puzzle);
    public Puzzle getPuzzle(int id);
}
