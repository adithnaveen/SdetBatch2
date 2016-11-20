package com.fannie.debug;

class Table{
	int len;
	int bre;
	
	Table(int len, int bre){
		this.len = len;
		this.bre = bre;
	}
	
	public int add(){
		return this.len + this.bre;
	}
	
}

public class DebugEx1 {
	public static void main(String[] args) {
		Table t1 = new Table(11,22);
		System.out.println("Addition is " + t1.add());
		
		Table tables[] = new Table[4];
		tables[0] = new Table(22,33);
		tables[1] = new Table(122,332);
		tables[2] = new Table(222,333);
		tables[3] = new Table(322,335);
		
		
	}
}
