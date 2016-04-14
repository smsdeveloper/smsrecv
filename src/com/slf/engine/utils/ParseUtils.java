package com.slf.engine.utils;

public class ParseUtils {

	public static StringBuffer parseSmsSms(String s,String add[])
	{
		if(null == s)
		{
			return null;
		}
		StringBuffer buffer = new StringBuffer();
		String str[] = s.split("\\{");
		
		for(int i = 0; i < str.length; i++)
		{
			if(i == 0)
			{
				buffer.append(str[i]);
			}else{
				buffer.append(str[i].substring(str[i].indexOf("}") + 1, str[i].length()));
			}
			if(i < str.length -1)
			{
				int len = Integer.valueOf(str[i+1].substring(0, str[i+1].indexOf("}")));
				if(i + 1 < add.length)
				{
					len = add[i + 1].length() >= len ? len : add[i].length();
					buffer.append(add[i + 1].substring(0, len));
				}
			}
		}
		
		return buffer;
	}
	
	public static void main(String args[])
	{
		String s = "123123123{2}abcdefg{8}";
		
		String ss[] = {"1395959594","iiiii","77777"};
		System.out.println(parseSmsSms(s,ss));
	}
}
