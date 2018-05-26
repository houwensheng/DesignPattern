package composite.safe;

public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("服装");
		Composite c1 =  new Composite("男装");
		Composite c2 =  new Composite("女装");
		
		Leaf leaf1 = new Leaf("衬衫");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");
        
        //在上面声明中，分别使用了Composite类和Leaf类
        //而没有使用接口Component，就是因为此处需要调用聚集管理方法
        //接口中没有这些方法
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        
        root.printStruct("");
	}
}
