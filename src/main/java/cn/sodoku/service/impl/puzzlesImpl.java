package cn.sodoku.service.impl;

import cn.sodoku.Dao.puzzlesDao;
import cn.sodoku.Entity.Puzzle;
import cn.sodoku.service.puzzlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class puzzlesImpl implements puzzlesService {
    @Autowired
    puzzlesDao puzzlesDao;
    @Override
    public int add(Puzzle puzzle) {
        return puzzlesDao.add(puzzle);
    }

    @Override
    public Puzzle getPuzzle(int id) {
        return puzzlesDao.getPuzzle(id);
    }
}
