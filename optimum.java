import java.util.*;      //aabbbcccd-->a2b3c3d
public class optimum{
public static void main(String[] args){
	String s="aabbbcccd";
	int count=1;
	String ans=""+s.charAt(0);
	for(int i=1;i<s.length();i++){
		char curr=s.charAt(i);
		char prev=s.charAt(i-1);
		if(prev==curr){
			count++;
		}
		else{
			ans+=count;
			ans+=curr;
			count=1;
		}
		
	}
	if(count>1) ans+=count;
	System.out.println(ans);
}
}