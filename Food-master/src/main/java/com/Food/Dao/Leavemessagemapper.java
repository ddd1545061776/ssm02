package com.Food.Dao;

import java.util.List;

import com.Food.Entity.Leavemessage;
import org.springframework.stereotype.Repository;


public interface Leavemessagemapper {
	public void AddLeavemessage(Leavemessage model);
	public List<Leavemessage> GetLeavemessageByShopId(String shopId);
}
