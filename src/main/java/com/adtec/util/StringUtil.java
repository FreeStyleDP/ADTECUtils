package com.adtec.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringUtil {

	public static void main(String[] args) throws IOException {
//		String[] array = {"a","b","c","c","d","e","e","e","a"};  
//		String[] goal = {"e"};  
//		String[] arry = removeDuplicateArr(array);
//		String[] arry = removeGoalStr(array, goal);
//		for (String arr : arry) {
//			System.out.println(arr);
//		}
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\11"));
		String readLine = null;
		while((readLine = br.readLine() )!= null) {
			System.out.println(stringFormate(readLine));
		}
		br.close();
	}
	
    /**
     * 将element格式转换为QrBook中对应的属性对应
     * @param string
     * @return
     */
    private static String stringFormate(String element) {
    	String flag = "";
    	
    	for (int i = 0; i < element.length(); i++) {
    		if(element.charAt(i) >= 65 && element.charAt(i) <= 90) {//是否为大写字母
    			flag =flag + "_"+element.charAt(i);
    		}else {
    			flag =flag +element.charAt(i);
    		}
    	}
    	
		return flag.toLowerCase();
	}
	/**
	 *  通过key获取value ， 没有为空
	 * @time 2018年8月31日 下午5:34:56
	 * @author dengp_w
	 * @param key
	 * @return
	 */
	public static String getValueByKey(String[] enu , String key) {
		for (int i = 0; i < enu.length; i++) {
			String[] split = enu[i].split("-");
			if(split[0].equals(key)) {
				return split[1];
			}
		}
		return key;
	}
	/**
	 * 补足字符串长度
	 * @param goal 目标字符串
	 * @param length 目标长度
	 * @param location 0:在前补位  1：在后补位
	 * @param flag
	 * @return
	 */
	public static String complementLengh(String goal ,int length ,int location , char flag){
		goal = (goal == null) ? "" : goal;
		StringBuilder addSB = new StringBuilder("");
		while ( goal.length() + addSB.length() < length) {
			addSB.append(flag);
		}
		if(location == 0){
			goal = addSB.toString() + goal ;
		}else if(location == 1){
			goal = goal +addSB.toString() ;
		}else {//其他都补在后
			goal = goal +addSB.toString() ;
		}
		
		return goal;
	}
	
	/**
	 * 去除数组中重复 元素
	 * @param array
	 * @return
	 */
	public static String[] removeDuplicateArr(String[] array) {
		List<String> result = new ArrayList<String>();  
		boolean flag;  
		for(int i=0;i<array.length;i++){  
		    flag = false;  
		    for(int j=0;j<result.size();j++){  
		        if(array[i].equals(result.get(j))){  
		            flag = true;  
		            break;  
		        }  
		    }  
		    if(!flag){  
		        result.add(array[i]);  
		    }  
		}  
		String[] arrayResult = (String[]) result.toArray(new String[result.size()]); 
		return arrayResult;
	}
	
	/**
	 * 去除 目标数组指定的 元素
	 * @param array
	 * @param goal
	 * @return
	 */
	public static String[] removeGoalStr(String[] array , String[] goal) {
		List<String> result = new ArrayList<String>();  
		boolean flag;  
		for(int i=0;i<array.length;i++){  
		    flag = false;  
		    for(int j=0;j<goal.length;j++){  
		        if(array[i].equals(goal[j])){  
		            flag = true;  
		            break;
		        }  
		    }  
		    if(!flag){  
		        result.add(array[i]);  
		    }  
		}  
		return (String[]) result.toArray(new String[result.size()]);
	}
	
	/**
	 * 判断数组中是否包含  字符串
	 * @time 2018年9月21日 上午9:29:52
	 * @author dengp_w
	 * @param pubOperateFileType2
	 * @param fileType
	 * @return
	 */
	public static boolean contains(String[] pubOperateFileType2, String fileType) {
		for (String fileType1 : pubOperateFileType2) {
			if(fileType.equals(fileType1)) {
				return true;
			}
		}
		return false;
	}
}
