class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {

            if(tokens[i].equals("+") || 
               tokens[i].equals("-") || 
               tokens[i].equals("/") || 
               tokens[i].equals("*")) {

                int p1 = Integer.parseInt(st.pop());
                int p2 = Integer.parseInt(st.pop());

                int res = 0;

                switch(tokens[i]) {
                    case "+":
                        res = p2 + p1;
                        break;

                    case "-":
                        res = p2 - p1;
                        break;

                    case "*":
                        res = p2 * p1;
                        break;

                    case "/":
                        res = p2 / p1;
                        break;
                }

                st.push(String.valueOf(res));
            }
            else {
                st.push(tokens[i]);
            }
        }

        return Integer.parseInt(st.peek());
    }
}