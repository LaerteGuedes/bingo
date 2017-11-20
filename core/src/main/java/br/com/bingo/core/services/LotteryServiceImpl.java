package br.com.bingo.core.services;

import br.com.bingo.core.model.Lottery;
import br.com.bingo.core.repositories.LotteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by laerteguedes on 19/11/17.
 */
@Service
public class LotteryServiceImpl extends BaseServiceImpl<Lottery> implements LotteryService {

    @Autowired
    private LotteryRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
