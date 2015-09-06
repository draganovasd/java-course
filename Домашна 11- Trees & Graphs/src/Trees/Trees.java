package Trees;

import java.util.LinkedList;
import java.util.List;
public class Trees<T> {
	T data;
    Trees<T> parent;
    List<Trees<T>> children;

    public Trees(T data) {
        this.data = data;
        this.children = new LinkedList<Trees<T>>();
    }

    public Trees<T> addChild(T child) {
    	Trees<T> childNode = new Trees<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    int count=0;
    
    public int findDepth(Trees<T> node, int depth,T data){
 
    	if(node.data==data){
    		count=depth;
    	} 	
    	depth++;
    	for (int i = 0; i < node.children.size(); i++) {
			findDepth(node.children.get(i), depth,data);
    	}
    	
    	return count;
    }
    
    public void print(Trees<T> node, int depth){
    	for (int i = 0; i < depth; i++) {
    	  	System.out.print("\t");	
		}
    	System.out.println(node.data);
    		
    	depth++;
    	
    	for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
			
		
		}
    	
    	
    }
}
