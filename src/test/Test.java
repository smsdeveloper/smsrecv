package test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.slf.common.client.HttpSqsServiceImpl;
import com.slf.common.client.IHttpSqsService;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.common.SysContants;

public class Test {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LsMosms lsMosms = new LsMosms();
		lsMosms.setDxid(1234l);
		lsMosms.setJsh("1445");
		lsMosms.setJsnr("你好");
		lsMosms.setJshm("13858001723");
		lsMosms.setTdbh("3001");
		
		try {
			Map map = BeanUtils.describe(lsMosms);
//			System.out.println(map.toString());
			IHttpSqsService httpSqsService = new HttpSqsServiceImpl();
			httpSqsService.putIntoSqs(SysContants.HTTPSQS_URL,SysContants.HTTPSQS_NAME,SysContants.HTTPSQS_AUTH, map);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
