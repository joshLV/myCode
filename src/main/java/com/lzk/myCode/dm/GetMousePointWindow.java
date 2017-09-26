package com.lzk.myCode.dm;

import java.io.IOException;
import java.lang.reflect.Field;

import com.lzk.myCode.dm.function.DM;

public class GetMousePointWindow {
	
	public static void main(String[] args) {
		DM dm = new DM();
		Object getMousePointWindow = dm.GetMousePointWindow();
		System.out.println(getMousePointWindow);
	}
	
	static{
		try {
			String dllPath = System.getProperty("user.dir")+"/src/main/resources/dll";
			addLibraryDir(dllPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addLibraryDir(String libraryPath) throws IOException {  
        try {  
            Field field = ClassLoader.class.getDeclaredField("usr_paths");
            field.setAccessible(true);  
            String[] paths = (String[]) field.get(null);  
            for (int i = 0; i < paths.length; i++) {  
                if (libraryPath.equals(paths[i])) {  
                    return;  
                }  
            }  
  
            String[] tmp = new String[paths.length + 1];  
            System.arraycopy(paths, 0, tmp, 0, paths.length);  
            tmp[paths.length] = libraryPath;  
            field.set(null, tmp);  
        } catch (IllegalAccessException e) {  
            throw new IOException(  
                    "Failedto get permissions to set library path");  
        } catch (NoSuchFieldException e) {  
            throw new IOException(  
                    "Failedto get field handle to set library path");  
        }  
    }  
}
