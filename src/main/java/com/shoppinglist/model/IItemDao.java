package com.shoppinglist.model;

import java.util.List;

public interface IItemDao {

	List<Item> findAllItem();

	void addAnItem(Item item);
}
