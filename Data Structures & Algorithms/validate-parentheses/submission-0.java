class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c : chars){
            if(stack.isEmpty() || stack.peek()==null){
                stack.push(c);
            }else {
                char p = stack.peek();
                if(p=='(' && c==')'
                || p=='[' && c==']'
                || p=='{' && c=='}'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
