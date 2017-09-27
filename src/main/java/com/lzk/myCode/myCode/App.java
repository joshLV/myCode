package com.lzk.myCode.myCode;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        System.out.println( "Hello World!" );
        Process exec = Runtime.getRuntime().exec("regsvr32 src/main/resources/dll/dm.dll");
        InputStream in = exec.getInputStream();
        while (in.read() != -1) {
            System.out.println(in.read());
        }
        in.close();
        exec.waitFor();
        //File file = new File( System.getProperty("user.dir")+"\\src\\main\\resources\\dll\\注册大漠插件到系统.bat");
        //Desktop.getDesktop().open(file);
    }
}
