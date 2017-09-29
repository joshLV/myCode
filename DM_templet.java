package com.lzk.myCode.dm.function;

import java.io.InputStream;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class DM {
	Dispatch dispatch;
	public DM(){
		try {
			this.dispatch = new ActiveXComponent("dm.dmsoft").getObject();//获得dm对象
		} catch (Exception e) {
	        Process exec = null;
			try {
				exec = Runtime.getRuntime().exec("regsvr32 src/main/resources/dll/dm.dll");//没有注册,执行注册dm.dll
		        InputStream in = exec.getInputStream();
		        while (in.read() != -1) {
		            System.out.println(in.read());
		        }
		        in.close();
		        exec.waitFor();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			this.dispatch = new ActiveXComponent("dm.dmsoft").getObject();//重新获得dm对象
		}
	}
	{等待替换}
}
