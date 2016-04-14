package com.slf.common.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.slf.common.util.CryptUtils;
import com.slf.engine.common.SysContants;

public class HttpSqsServiceImpl implements IHttpSqsService {

	private static final Logger log = Logger.getLogger(HttpSqsServiceImpl.class);
	
	private static String mapToStr(Map<String, String> obj)
	{
		StringBuffer str = new StringBuffer();
		Iterator<String> keys = obj.keySet().iterator();
		while(keys.hasNext())
		{
			String key = keys.next();
			str.append(key);
			str.append("=");
			str.append(obj.get(key));
			str.append("|");
		}
		return str.toString();
	}
	
	public boolean putIntoSqs(String httpUrl,String name,String httpAuth,Map<String, String> obj)
	{
		BufferedReader instream = null;
		StringBuffer strUrl =new StringBuffer(httpUrl);
		strUrl.append("?name=");
		strUrl.append(name);
		strUrl.append("&opt=put");
		strUrl.append("&data=");
		try {
			strUrl.append(URLEncoder.encode(mapToStr(obj), SysContants.DEFAULT_CHARSET));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
		}
		String auth = httpAuth.startsWith("{3DES}") ? CryptUtils.decrypt(httpAuth.replace("{3DES}", "")) : httpAuth;
		strUrl.append("&auth=");
		strUrl.append(auth);
		URL url = null;
        try {
                url = new URL(strUrl.toString());
                instream = new BufferedReader(new InputStreamReader(url.openStream()));
                String s = null;
                StringBuffer result = new StringBuffer("");
                while((s = instream.readLine()) != null)
                {
                        result.append(s);
                }
                if(result.toString().indexOf("HTTPSQS_PUT_OK") != -1)
                {
                	return true;
                }
        } catch (MalformedURLException e) {
    		log.log(Priority.ERROR, "the httpsqs error->try again 3s");
            return putIntoSqs(httpUrl,name,httpAuth ,obj);
        } catch (IOException e) {
			// TODO Auto-generated catch block
        	log.log(Priority.ERROR, "the httpsqs error->try again 3s");
        	return putIntoSqs(httpUrl,name,httpAuth ,obj);
		}finally{
        	if(instream != null)
        	{
        		try {
					instream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
				}
        	}
        }
		return false;
	}
	
	
	private static Map<String, String> strToMap(String str)
	{
		Map<String, String> obj = new HashMap<String, String>();
		String ss[] = str.split("\\|");
		for(int i = 0; i < ss.length; i++)
		{
			String s = ss[i];
			if(s.length() > 0)
			{
				String sobj[] = s.split("\\=");
				if(sobj.length == 2)
				{
					obj.put(sobj[0], sobj[1]);
				}else{
					obj.put(sobj[0], "");
				}
			}
		}
		return obj;
	}
	public Map<String, String> getFromSqs(String httpUrl,String name,String httpAuth)
	{

		BufferedReader instream = null;
		StringBuffer strUrl =new StringBuffer(httpUrl);
		strUrl.append("?name=");
		strUrl.append(name);
		strUrl.append("&opt=get");
		strUrl.append("&auth=");
		String auth = httpAuth.startsWith("{3DES}") ? CryptUtils.decrypt(httpAuth.replace("{3DES}", "")) : httpAuth;
		strUrl.append(auth);
		URL url = null;
        try {
            url = new URL(strUrl.toString());
            instream = new BufferedReader(new InputStreamReader(url.openStream()));
            String s = null;
            StringBuffer result = new StringBuffer("");
            while((s = instream.readLine()) != null)
            {
                    result.append(s);
            }
            if(result.toString().indexOf("HTTPSQS_GET_END") == -1)
            {
            	 return strToMap(URLDecoder.decode(result.toString(),SysContants.DEFAULT_CHARSET));
            }
        } catch (MalformedURLException e) {
    		log.log(Priority.ERROR, "the httpsqs error->try again 3s");
    		return getFromSqs(httpUrl,name,httpAuth);
        } catch (IOException e) {
			// TODO Auto-generated catch block
        	log.log(Priority.ERROR, "the httpsqs error->try again 3s");
        	return getFromSqs(httpUrl,name,httpAuth);
		}finally{
        	if(instream != null)
        	{
        		try {
					instream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
				}
        	}
        }
        return null;
	}
	
}
