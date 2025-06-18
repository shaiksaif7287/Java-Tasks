public class RemoveChars{
    public static String removeChars(String A,String B){
        java.util.Set<Character> toRemove=new java.util.HashSet<>();
            for(char ch:B.toCharArray()){
                toRemove.add(ch);
            }
            StringBuilder leftover=new StringBuilder();
            for(char ch:A.toCharArray()){
                if(!toRemove.contains(ch)){
                    leftover.append(ch);
                }
            }
        return leftover.length() > 0 ? leftover.toString() : "Empty";
    }
    
    public static void main(String[] args){
        String A="ABCDEF";
        String B="BDE";
        System.out.println(removeChars(A,B));
    }
}