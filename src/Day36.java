package dailyCodingPractice;

class node{
	node left;
	node right;
	int data;
	node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}



public class Day36 {
	
	static int count=0;
	
	
	public static void main(String[] args) {
		Day36 tree = new Day36();
		node root = null;
		root = tree.add(root,50);
		root =tree.add(root,30);
		root = tree.add(root,20);
		root = tree.add(root,40);
		root = tree.add(root,70);
		root = tree.add(root,60);
		root = tree.add(root,80);
		
		 
        /* my BST 
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
		
		
		secondLargestUtil(root);
		
	}
	
	public node add(node root,int data) {
		if(root == null) {
			return new node(data);
			
		}else {
			if(root.data >= data) {
				root.left = add(root.left,data);
				
			}else {
				root.right = add(root.right,data);
				
			}
		}
		
		return root;
	}
	
    public static void secondLargestUtil(node node)
    {  
        
        if (node == null || count >= 2)
            return;
             
        secondLargestUtil(node.right);
         
         
        count++;
        
         
        if (count == 2) {
            System.out.print("2nd largest element is "+
                                              node.data);
            return;
        }
        
        secondLargestUtil(node.left);
    }
 
	
}
