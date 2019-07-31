package com.brainmentors.todolist.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.brainmentors.todolist.dto.CommonGenericDTO;

public interface CacheStore {
	HashMap<String,ArrayList<CommonGenericDTO>> cacheMap = new HashMap<>();
}
