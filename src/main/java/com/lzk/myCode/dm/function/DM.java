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
	//==============================================================foobar==============================================================
	public Object CreateFoobarCustom(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CreateFoobarEllipse(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CreateFoobarRect(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CreateFoobarRoundRect(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarClearText(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarClose(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarDrawLine(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarDrawPic(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarDrawText(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarFillRect(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarLock(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarPrintText(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarSetFont(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarTextLineGap(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarTextPrintDir(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarTextRect(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarUnlock(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FoobarUpdate(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================window==============================================================
	public Object ClientToScreen(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnumWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnumWindowByProcess(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindWindowByProcess(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindWindowByProcessId(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindWindowEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindWindowSuper(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetClientSize(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetForegroundFocus(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetForegroundWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetMousePointWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetPointWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetSpecialWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowClass(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowProcessId(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowProcessPath(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowRect(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowState(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWindowTitle(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object MoveWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ScreenToClient(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SendString(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SendString2(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SendStringIme(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetClientSize(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWindowSize(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWindowState(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWindowText(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWindowTransparent(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================����==============================================================
	public Object FaqCapture(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FaqCaptureFromFile(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FaqFetch(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FaqGetSize(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FaqPost(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FaqSend(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================������==============================================================
	public Object DmGuard(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================��̨����==============================================================
	public Object BindWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object BindWindowEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object DownCpu(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableKepadPatch(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableKeypadSync(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableMouseSync(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableRealKeypad(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableRealMouse(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ForceUnBindWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object IsBind(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LockInput(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object UnBindWindow(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================���==============================================================
	public Object AsmAdd(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object AsmCall(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object AsmClear(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object AsmCode(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Assemble(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================������==============================================================
	public Object GetBasePath(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetDmCount(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetID(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetLastError(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetPath(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Reg(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RegEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetDisplayInput(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetPath(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetShowErrorMsg (Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Ver(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================����==============================================================
	public Object GetCursorShape(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetCursorSpot(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyDown(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyDownChar(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyPress(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyPressChar(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyPressStr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyUp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object KeyUpChar(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LeftClick(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LeftDoubleClick(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LeftDown(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LeftUp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object MiddleClick(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object MoveR(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object MoveTo(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RightClick(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RightDown(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RightUp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetKeypadDelay(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetMouseDelay(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WheelDown(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WheelUp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================�ڴ�==============================================================
	public Object FindData(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindDataEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindDouble(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindDoubleEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindFloat(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindFloatEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindInt(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindIntEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindString(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStringEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetModuleBaseAddr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadData(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadDouble(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadFloat(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadInt(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadString(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetMemoryHwndAsProcessId(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteData(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteDouble(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteFloat(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteInt(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteString(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================�㷨==============================================================
	public Object ExcludePos(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindNearestPos(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SortPosDistance(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================ͼɫ==============================================================
	public Object AppendPicAddr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object BGR2RGB(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Capture(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CaptureGif(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CaptureJpg(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CapturePng(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CapturePre(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CmpColor(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableDisplayDebug(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object EnableGetColorByCapture(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindColor(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindColorE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindColorEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindMultiColor(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindMultiColorE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindMultiColorEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPic(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicExS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicMem(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicMemE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicMemEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindPicS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindShape(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindShapeE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindShapeEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FreePic(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetAveHSV(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetAveRGB(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetColor(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetColorBGR(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetColorHSV(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetColorNum(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetPicSize(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetScreenData(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ImageToBmp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object LoadPic(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object MatchPicName(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RGB2BGR(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetPicPwd(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================�ļ�==============================================================
	public Object DecodeIni(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadIni(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ReadIniPwd(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteIni(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object WriteIniPwd(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================����ʶ��==============================================================
	public Object AddDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ClearDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FetchWord(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrExS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrFast(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrFastE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrFastEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrFastExS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrFastS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrS(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrWithFont(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrWithFontE(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindStrWithFontEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetDictCount(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetDictInfo(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetNowDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetResultCount(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetResultPos(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWordResultCount(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWordResultPos(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWordResultStr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWords(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetWordsNoDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Ocr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object OcrEx(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object OcrInFile(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SaveDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetColGapNoDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetDictMem(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetDictPwd(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetExactOcr(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetMinColGap(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetMinRowGap(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetRowGapNoDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWordGap(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWordGapNoDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWordLineHeight(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetWordLineHeightNoDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object UseDict(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================ϵͳ==============================================================
	public Object Beep(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CheckFontSmooth(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CheckUAC(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Delay(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object DisableFontSmooth(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object DisablePowerSave(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object DisableScreenSave(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object ExitOs(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetClipboard(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetDir(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetDiskSerial(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetMachineCode(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetMachineCodeNoMac(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetNetTime(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetNetTimeSafe(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetOsType(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetScreenDepth(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetScreenHeight(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetScreenWidth(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetTime(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Is64Bit(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Play(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object RunApp(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetClipboard(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetDisplayAcceler(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetScreen(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object SetUAC(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object Stop(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	//==============================================================����==============================================================
	public Object ActiveInputMethod(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object CheckInputMethod(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object FindInputMethod(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
	public Object GetCursorPos(Object... obj){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return Dispatch.call(dispatch, methodName,obj);
	}
}
