package com.sdu.oo.graph;

public class Name 
{
	public static enum graphName//图形名字的枚举变量
	{
		Circle,Rectangle,Triangle,Oval
	}
	
	/**
	 * Descriptoin :通过字符串匹配枚举图形名字
	 * @param String
	 * @return graphName
	 */
	public static graphName GetName(String s)//通过字符串得到grapgName类
	{
		return graphName.valueOf(s);
	}
}
