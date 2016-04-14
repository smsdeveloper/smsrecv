package com.slf.common.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class Utils {

	
	public static String bytesToOrcHex(String src,String key)
	{
		String result = "";
		Hex hex = new Hex();
		String sign = new String(hex.encode(src.getBytes()));
		sign += key;
		byte temp[] = null;
		try {
			temp = KeyedDigestMD5.getKeyedDigest(hex.decode(sign.getBytes()),"".getBytes());
			for (int i=0; i<temp.length; i++){
				result+=Integer.toHexString((0x000000ff & temp[i]) | 0xffffff00).substring(6);
			}
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
		}
		
		return result.toUpperCase();
	}
	
	/**
	 * 判断是否存在后缀签名
	 * @param input
	 * @return false 表示要加后缀 true 表示已经存在
	 */
	public static boolean hasSuffix(String input)
	{
		int start = input.lastIndexOf("[");
		int end = input.lastIndexOf("]");
		//start = start == -1 ? input.lastIndexOf("【") : start;
		try {
			if(start == -1 || end == -1 || start > end || end+1 < input.length() 
					|| input.substring(start, end+1).getBytes("gbk").length > 14)
			{
				return false;
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
		}
		return true;
	}
	
	
	public static String replaceString(String nr){		
		if(nr.startsWith("86")){
			nr = nr.replaceFirst("86", "");
		}		
		return nr;		
	}
	
	
	public static void main(String[]args){
		String str = "13568867878";
		System.out.println(replaceString(str));
	}
	
}
