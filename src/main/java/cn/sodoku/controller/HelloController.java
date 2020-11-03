package cn.sodoku.controller;

import com.alibaba.fastjson.JSON;
import cn.sodoku.Entity.Leaderboard;
import cn.sodoku.Entity.Puzzle;
import cn.sodoku.service.leaderboardService;
import cn.sodoku.service.puzzlesService;
import cn.sodoku.util.DLX;
import cn.sodoku.util.Reversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class HelloController {
    @Autowired
    puzzlesService puzzlesService;
    @Autowired
    leaderboardService leaderboardService;

    @RequestMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("getsodoku")
    public Map<String,Object> getsodoku() {
        //return Reversion.run();
        Puzzle puzzle=puzzlesService.getPuzzle((new Random().nextInt(1000))+1);
        //Puzzle puzzle=puzzlesService.getPuzzle(1);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id",puzzle.getId());
        map.put("puzzle",puzzle.getPuzzle());
        int[][] data = JSON.parseObject(puzzle.getPuzzle(),int[][].class);
        if(DLX.hasSolve(data))
            map.put("answer",JSON.toJSON(DLX.run(data)).toString());
        List<Leaderboard> list=leaderboardService.getLeaderboard(puzzle.getId());
        map.put("leaderboard",list);
        return map;
    }

    @RequestMapping("init")
    public String init(){
        for(int i=0;i<1000;i++){
            String tmp=Reversion.run();
            Puzzle puzzle=new Puzzle(tmp);
            puzzlesService.add(puzzle);
        }
        return "success";
    }

    @PostMapping("getanswer")
    public String getanswer(@RequestBody Map<String,String> params) {
        String sodoku = params.get("sodoku");
        if(sodoku==null) return JSON.toJSON(new int[9][9]).toString();
        int[][] data = JSON.parseObject(sodoku,int[][].class);
        if(DLX.hasSolve(data)){
            return JSON.toJSON(DLX.run(data)).toString();
        }
        return JSON.toJSON(new int[9][9]).toString();
    }

    @GetMapping("getleaderboard")
    public String getLeaderboard(){
        return null;
    }


}
