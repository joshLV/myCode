package com.lzk.javaChm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCHMJ {
	private static final String File_SEPORATOR="/";//�ļ��ָ���
	private static final List<String> list = new ArrayList<String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ChmManager cm = new ChmManager(System.getProperty("user.dir")+"/src/main/resources/dll/��Į�ӿ�˵��.CHM");
			getContentFils(cm);
			for (String string : list) {
				System.out.println(string);
			}
			writeFile(list);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

	private static void getContentFils(ChmManager cm) throws Exception {
		ArrayList fes = (ArrayList) cm.enumerateFiles();
		FileEntry fe = null;
		String content = "sorry, it has no content file";
		for (int i = 0; i < fes.size(); i++) {
			fe = (FileEntry)fes.get(i);
			//if(fe.entryName.equals("/chapter17/-Unlicensed-17.04.08.htm"))
			 extractOne(cm,fe,System.getProperty("user.dir")+"/src/main/resources/��Į�ӿ�˵��html",fe.entryName);
		}

	}
	
	  public static void extractOne(ChmManager cm,FileEntry fe,String savef,String fileName) throws Exception {
		  try {
			  if(fe.length.longValue()==0)return;  
			  byte[][]tmp=cm.retrieveObject(fe);
			  writeFile(tmp,savef,fileName);     
		} catch (Exception e) {
			System.out.println(e);
		}
	    
	          
	    }
	    /**output  the specified file
	     */
	    private static void writeFile(byte[][] tmp,String savef,String fileName)throws Exception {
	        FileOutputStream fops=null,fops1=null;
	        try {
	        	createFileParentPath(savef,fileName);
	        	File file=new File(savef,fileName);
	            //fops=new FileOutputStream(file.getPath());
	            for(int i=0;i<tmp.length;i++){
	            	//System.out.println(new String(tmp[i]));
	            	list.add(new String(tmp[i]));
	                //fops.write(tmp[i]);
	            	}
	            //fops.close();
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    /**
		 * ˵��:����ÿ���ļ��ĸ�Ŀ¼
		 * DATE:2010-08-13
		 * @param output		��Ŀ¼
		 * @param filePath		�ļ�·��
		 * @throws Exception
		 */
		private static void createFileParentPath(String output,String filePath) throws Exception{
			int spcialTagMark=filePath.indexOf(File_SEPORATOR);
			if(spcialTagMark==-1)return;//˵�����ִ���ڸ�Ŀ¼��
			filePath=filePath.substring(0, filePath.lastIndexOf(File_SEPORATOR));
			if(CommonFunctions.isNotEmpty(filePath)){
				createFileDirectory(output,filePath);
			}
		}
		/**
		 * ˵��:����Ŀ¼
		 * @param output
		 * @param filePath
		 * @throws Exception
		 */
		private static void createFileDirectory(String output,String filePath) throws Exception{
			String[] filePaths=CommonFunctions.strToArray(filePath, File_SEPORATOR);
			String tmpPath=File_SEPORATOR;
			if (filePaths.length > 0) {
				for (int i = 0; i < filePaths.length; i++) {
					if (CommonFunctions.isEmpty(filePaths[i]))
						continue;
					// ��װ��Ŀ¼�ĸ���Ŀ¼
					if (i == (filePaths.length - 1)) {// ���һ���ڵ�ʱ
						tmpPath = tmpPath + filePaths[i];
					} else {
						tmpPath = tmpPath + filePaths[i] + File_SEPORATOR;
					}

					File dest = new File(output, tmpPath);
					CommonFunctions.createDirectory(dest);
				}
			} else {//���û��˫��Ŀ¼,��ֱ���ڸ�Ŀ¼�����ļ���
				File dest = new File(output,filePath);
				CommonFunctions.createDirectory(dest);
			}
		}
		
		public static void writeFile(List<String> list ) throws IOException{
			BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.java"));
			
			//ʹ�ø�Ч�ַ����������еķ�����һ�ζ�ȡһ����
			//һ��д��һ���ַ���
			for (String string : list) {
				bw.write(string);
				//����
				//bw.newLine();
				bw.flush();
			}
			
			//�ͷ���Դ
			bw.close();
		}

}
