package br.com.bingo.core.repositories;

import br.com.bingo.core.model.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by laerteguedes on 19/11/17.
 */
public interface LotteryRepository  extends JpaRepository<Lottery, Long>{
}
