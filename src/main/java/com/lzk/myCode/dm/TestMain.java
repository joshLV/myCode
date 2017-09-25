package com.lzk.myCode.dm;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.util.Arrays;

import org.junit.Test;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import com.lzk.myCode.dm.function.DM;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.library.path"));
		DM dm = new DM();
		Object getColor = dm.GetMousePointWindow();

				 

		System.out.println(getColor);
		dm.MoveTo(100,100);
		//System.out.println(getColor);
	}
	
	@Test
	public void test1(){
		Dispatch object = new ActiveXComponent("dm.dmsoft").getObject();
		Object intX = null;
		Object intY = null;
		Variant variant = Dispatch.call(object, "FindColor", 0,0,2000,2000,"ffffff",1.0,0,intX,intY);
		System.out.println(variant.getInt());
		System.out.println(intX);
		Object[] objs =  new Object[]{"0","100","2000","2000","ffffff","1.0","0"};
		Variant variant1 = Dispatch.call(object, "FindColorE", objs);
		System.out.println(variant1.getString());
		Variant variant2 = Dispatch.call(object, "WheelDown");
		Variant variant3 = Dispatch.call(object, "FindWindow","","���±�");
		System.out.println(variant3.getInt());
		Variant variant4 = Dispatch.call(object, "SetWindowState",variant3.getInt(),1);
		Object[] objs1 =  new Object[]{variant3.getInt(),200};
		Variant variant5 = Dispatch.call(object, "SetWindowTransparent",objs1);
	}
	
	@Test
	public void test2(){
		DM dm = new DM();
		Object checkFontSmooth = dm.CheckFontSmooth();
		System.out.println(checkFontSmooth);
	}
	@Test
	public void test3(){
		DM dm = new DM();
		Variant call = Dispatch.call( new ActiveXComponent("dm.dmsoft").getObject(), "EnableFontSmooth");
		System.out.println(call);
	}
	@Test
	public void test4(){
		DM dm = new DM();
		//Object regEx =  dm.Reg("a712372688fa03bab9566470b2e4a5e9363a569924","woyun741") ;
		Object getMousePointWindow = dm.GetMousePointWindow();
		System.out.println(getMousePointWindow);
		dm.BindWindow(getMousePointWindow,"normal","normal","normal",0);
		dm.MoveTo(0,0);
		dm.LeftClick();
	}
	@Test
	public void test5(){
		DM dm = new DM();
		//Object regEx = dm.Ver();
		dm.MoveTo(100,100);
		//System.out.println(regEx);
	}
	@Test
	public void test6(){//a712372688fa03bab9566470b2e4a5e9363a569924 :2����
		DM dm = new DM();//qq401446551f1d754286bd86db811a21053d6bf2a9 :-1 �޷���������
		Object regEx =  dm.Reg("a712372688fa03bab9566470b2e4a5e9363a569924") ;
		dm.MoveTo(100,100);
		System.out.println(regEx);
	}
	@Test
	public void test7(){
		DM dm = new DM();
		Object regEx =  dm.GetAveRGB(30,30,100,100);
		dm.MoveTo(100,100);
		System.out.println(regEx);
	}
	@Test
	public void test8(){
		DM dm = new DM();
		String[][] strArr = new String[30][100];
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 10; j++) {
				Object regEx =  dm.GetColor(i,j);
				System.out.println(regEx);
				strArr[i][j] = regEx.toString();
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
	@Test
	public void test9() throws AWTException{
		Robot robot = new Robot();
		Color[][] strArr = new Color[30][100];
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 10; j++) {
				Color pixelColor = robot.getPixelColor(100, 100);
				System.out.println(pixelColor);
				strArr[i][j] = pixelColor;
			}
		}
		
	}
	@Test
	public void test10(){
		DM dm = new DM();
		Object fetchWord = dm.FetchWord(218,52,340,100,"808080-ffffff","5");
		System.out.println(fetchWord);
		
	}
	@Test
	public void test11() throws AWTException{
		DM dm = new DM();
		dm.SetDict(0,"C:/Users/Administrator/Desktop/��ʷ/��12.txt");
		dm.UseDict(0);
		Object fetchWord = dm.Ocr(0,340,300,440,"000000",0.8);
		System.out.println(fetchWord);
	}
	
	@Test
	public void test12(){
		System.out.println(System.getProperty("java.library.path"));
		//ActiveXComponent activeXComponent = new ActiveXComponent("dm.dmsoft").getObject();
	}
	
	@Test
	public void test13(){
		DM dm = new DM();
		Object keyPressStr = dm.KeyPressStr("123,456",20);
		System.out.println(keyPressStr);
	}
	
	@Test
	public void test14(){//注册
		DM dm = new DM();
		Object ver = dm.Ver();
		System.out.println(ver);
//		Object regEx = dm.RegEx("zifeng1a7b7fe753bb1d197847be3a7cbf1581","fgdffff","123.45.4.6|78.79.26.3");
//		System.out.println(regEx);
				
	}
	
}