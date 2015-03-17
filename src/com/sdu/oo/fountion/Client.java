package com.sdu.oo.fountion;

import java.util.ArrayList;

import com.sdu.oo.graph.Circle;
import com.sdu.oo.graph.Graph;
import com.sdu.oo.graph.Rectangle;
import com.sdu.oo.graph.Triangle;

public class Client //客户端类
{
	private ArrayList<Graph> graphs;
	private Adapter adapter;
	
	public Client()//构造函数
	{
		graphs=new ArrayList<Graph>();//建立对象
		adapter=new Adapter();
		
		graphs=adapter.getGraphsObject();//得到输入的图形对象
	}
	
	/**
	 * Description :将所有得到的图形画出来
	 */
	public void drawAll()//一个个画图形
	{
		Graph graph;
		
		for(int i=0;i<graphs.size();i++)//循环得到
		{
			graph=graphs.get(i);
			graph.Draw();
		}
	}
	
	
	
//	private ArrayList<Object> drawsArrayList;//声明列表
//	
//	private Circle circle1;//声明各种图形
//	private Rectangle rectangle1;
//	private Triangle triangle1;
//	
//	public Client()//构造方法
//	{
//		initialize();//初始化
//		addList();//丰富列表
//		drawList();//画出列表的方法
//	}
//	
//	private void initialize()//初始化方法
//	{
//		drawsArrayList=new ArrayList<Object>();//初始化链表
//		
//		circle1=new Circle();//初始化各种图形
//		rectangle1=new Rectangle();
//		triangle1=new Triangle();
//	}
//	
//	public void addList()//加入链表方法
//	{
//		drawsArrayList.add(circle1);
//		drawsArrayList.add(rectangle1);
//		drawsArrayList.add(triangle1);
//	}
//	
//	public void drawList()
//	{
//		((Circle) drawsArrayList.get(0)).Draw();
//		((Rectangle) drawsArrayList.get(1)).Draw();
//		((Triangle) drawsArrayList.get(2)).draw();
////		for(int i=0;i<drawsArrayList.size();i++)
////		{
////		}
//	}
}

