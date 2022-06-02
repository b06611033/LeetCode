class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<Character>();
       for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == '(' ||  s.charAt(i) == '[' ||  s.charAt(i) == '{' ) stack.push(s.charAt(i));
           else if (!stack.empty()){
               if (stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
               else if (stack.peek() == '[' && s.charAt(i) == ']') stack.pop();
               else if (stack.peek() == '{' && s.charAt(i) == '}') stack.pop(); 
               else stack.push(s.charAt(i));
           }
           else return false; 
           
       }
       return (stack.empty());
    }
}
