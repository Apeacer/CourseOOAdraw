package com.sdu.oo.fountion;

import java.util.ArrayList;

import com.sdu.oo.graph.Circle;
import com.sdu.oo.graph.Graph;
import com.sdu.oo.graph.Name;
import com.sdu.oo.graph.Oval;
import com.sdu.oo.graph.Rectangle;
import com.sdu.oo.graph.Triangle;

public class Adapter 
{
	private Input inputObjectInput;//获得输入功能对象
	private ArrayList<String> names;//声明名字列表容器
	
	public Adapter()
	{
		inputObjectInput=new Input();//初始化获得		
		names=new ArrayList<String>();//获得的名字列表容器
		names =inputObjectInput.getInput();//获得名字列表并赋值
	}
	
	/**
	 * Description :从名字列表中的String适配子类
	 * @return ArrayList<Graph>
	 */
	public ArrayList<Graph> getGraphsObject()//得到形状对象列表
	{
		ArrayList<Graph> graphs=new ArrayList<Graph>();//队列容器
		
		for(int i=0;i<names.size();i++)//循环得到名字队列
		{
			Graph graph=null;//对象容器
			
			switch(Name.GetName(names.get(i)))//根据名字匹配
			{
			case Circle:
				graph=new Circle();
				break;
			case Triangle:
				graph=new Triangle();
				break;
			case Rectangle:
				graph=new Rectangle();
				break;
			case Oval:
				graph=new Oval();
				break;
			}
			
			graphs.add(graph);//加入返回队列
		}
		return graphs;
	}

}
