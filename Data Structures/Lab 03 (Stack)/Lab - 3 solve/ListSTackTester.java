import java.util.*;
public class ListSTackTester{ 
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    String s =sc.next();
    if(parenthesisCheck(s))
      System.out.println( "The parentheses in the given expression is  BALANCED.");
    else
      System.out.println( "The parentheses in the given expression is NOT BALANCED.");
  }
  
  public static boolean parenthesisCheck(String str ) {
    Stack<Character> s =new Stack<Character>();
    char[] c =str.toCharArray();
    for (int i = 0; i < c.length; i++) { 
      if (c[i]=='('||c[i]=='{'||c[i]=='['){
        s.push(c[i]); 
      }else if (c[i]==')'||c[i]=='}'||c[i]==']'){
        if (s.isEmpty()){
          System.out.println("Trying to pop from an empty stack");
          return false;
        }else{
          char start = s.pop();
          char end=c[i];
          if(start=='(' && end==')')
            return true;
          else if(start=='{'&& end=='}')
            return true;
          else if(start=='['&& end==']')
            return true;
          else{//start!=end
            System.out.println("Opening and closing parenthesis don't match" ); 
            return false;
          }
        }
      }
    }
    if (s.isEmpty()==true){
      System.out.println("correct expression");
      return true;
    }else{
      System.out.println("There is/are additional opening bracket(s) Wrong expression");
      return false;
    }
  }
}
