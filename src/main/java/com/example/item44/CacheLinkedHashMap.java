package com.example.item44;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheLinkedHashMap extends LinkedHashMap {

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size() > 100;
    }
}
