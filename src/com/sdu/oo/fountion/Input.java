package com.sdu.oo.fountion;

import java.util.ArrayList;
import java.util.Scanner;

import com.sdu.oo.graph.Name;
import com.sdu.oo.graph.Name.graphName;

public class Input 
{
	boolean isNameAgain=true;
	
	int count;
	ArrayList<String> inputs;
	
	public Input()//构造方法
	{
		inputs=new ArrayList<String>();
	}
	
	/**
	 * Description :在控制台先输入要画图形的个数，再输入图形的名字，如错误将重新输入
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getInput()//返回输入的图形名字队列
	{
		Scanner scanne=new Scanner(System.in);//扫描仪输入对象	
		int count = scanne.nextInt();//输入要输入的图形个数
	
		for(int i=0;i<count;i++)//按次数输入形状名字
		{
			String name=scanne.next();//输入名字
			
			while(isNameAgain)//判断名字是否在
			{
				isNameAgain=false;
				
				try //判断方法
				{
					 graphName.valueOf(name);
				} 
				catch (Exception e) 
				{
					System.out.println("输入有误，请重新输入");
					isNameAgain=true;
					name=scanne.next();//重新输入的名字
				}
			}
			isNameAgain=true;//重新初始化
			//将名字加入列表
			inputs.add(name);	
		}
		
		return inputs;
	}

}
