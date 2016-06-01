package com.huma.oa.base.utils;

public class StringUtils {

	static public boolean isEmpty(String str) {
        if (str == null) return true;
        if ("".equals(str.trim())) return true;
        return false;
    }
}
