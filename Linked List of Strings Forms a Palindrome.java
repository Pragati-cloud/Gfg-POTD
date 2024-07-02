class Solution {
    public boolean compute(Node root) {
        StringBuilder str = new StringBuilder();
        while(root != null){
           str.append(root.data);
           root = root.next;
        }
        String temp = str.toString();
        int i=0, j = temp.length() -1;
        while(i<j){
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
            
        }
        return true;
    }
    
}
