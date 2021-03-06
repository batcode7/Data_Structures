public class binaryTrees {
     public static void main(String[] args) {
          Object a []={"A","B","C","D","E",null,"G","H",null,null,"X",null,"Z",null,"W",null,null,null,null,"K"};
          Object [] b = {null ,10,5,7,17,9,null,28} ;
          Node root1 = createTree (a , 1) ;
          Node root2 = createTree (b , 1) ;
          
          System.out.println("Height of tree_1 is = " + height(root1)) ; // task-1
          
          System.out.println("Level of tree_1 is = " +level(root1.left.right)) ; // task-2
          
          System.out.print("Printing tree_1 in Pre-order Traversal --> ") ; 
          preOrderTreversalPrint(root1) ; // task-3
          System.out.println () ;
          
          System.out.print("Printing tree_1 in In-order Traversal --> ") ; 
          inOrderTreversalPrint(root1) ; // task-4
          System.out.println () ;
          
          System.out.print("Printing tree_1 in Post-order Traversal --> ") ; 
          postOrderTreversalPrint(root1) ; // task-5
          System.out.println();
          
          if (compare(root1 , root2)) {  // task-6
               System.out.println ("Yes,Both trees are same. ") ;
          }else {
               System.out.println ("No,Both trees are not same. ") ;
          }
          
          System.out.print("Printing copy_tree_1 in Pre-order Traversal --> ") ;
          preOrderTreversalPrint(copyTree (root1)) ; // task-7
          System.out.println () ;
          
     }
     
     public static Node createTree (Object[] a , int i) {
          if (i < 0 || i >= a.length || a[i] == null) {
               return null ;
          }else {
               Node root = new Node (a[i] , null ,null , null) ;
               root.left = createTree (a , 2*i) ;
               root.right = createTree (a , 2*i + 1) ;
               if ( root.left != null ) {
                    root.left.parent = root ;
               }
               if (root.right != null) {
                    root.right.parent = root ;
               }
               return root ;
          }
     }
     
     public static int height (Node root) {  // Task - 1 height calculation
          if (root == null) {
               return 0 ;
          }
          else {
               return 1 + max(height(root.left) , height(root.right)) ;
          }
     }
     
     public static int max (int l , int r) {  // part of task_1
          if (l > r) {
               return l ;
          }else {
               return r ;
          }
     }
     
     public static int level(Node n) {  // Task - 2 level calculation
          if (n.parent == null) {
               return 0 ;
          }else {
               return 1 + level(n.parent) ;
          }
     }
     
     public static void preOrderTreversalPrint (Node n) { // Task - 3 Pre-order Traversal
          if (n != null) {
               System.out.print(n.element + " ") ;
               preOrderTreversalPrint(n.left) ;
               preOrderTreversalPrint(n.right) ;
          }
          
     }
     
     public static void inOrderTreversalPrint (Node n) { // Task - 4 In-order Traversal
          if (n != null) {
               inOrderTreversalPrint(n.left) ;
               System.out.print(n.element + " ") ;
               inOrderTreversalPrint(n.right) ;
          }
     }
     
     public static void postOrderTreversalPrint (Node n) { // Task - 5 Post-order Traversal
          if (n != null) {
               postOrderTreversalPrint(n.left) ;
               postOrderTreversalPrint(n.right) ;
               System.out.print(n.element + " ") ;
               
          }
     }
     
     public static boolean compare (Node root1 , Node root2) { // Task - 6 comparing two trees
          if (root1 == null && root2 == null) { 
               return true; 
          }
          else if (root1 != null && root2 != null) {
               if (root1.element == root2.element ) {
                    return (compare(root1.left, root2.left)&& compare(root1.right, root2.right)); 
               }
          }
          return false ; 
     }
     
     public static Node copyTree (Node root) {  // Task - 7 copying a tree from a tree
          if (root == null ) { 
               return null; 
          }else {
               Node newRoot = new Node (root.element , null , null, null) ;
               newRoot.left = copyTree (root.left) ;
               newRoot.right = copyTree (root.right) ;
               if (root.left != null) {
                    root.left.parent = root ;
               }
               if (root.right != null) {
                    root.right.parent = root ;
               }
               return newRoot ;
          }
     }
     
     
}
