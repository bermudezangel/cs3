//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
		setExpression("(abc(*def))");
	}

	public SyntaxChecker(String s)
	{
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
		Map<String, String> dream = new HashMap<String, String>();
   	    Stack<String> symbols = new Stack<String>();  
		String currValue;
		boolean stackIsEmpty = false;
		dream.put("{", "}");
		dream.put("(", ")");
		dream.put("<", ">");
		dream.put("[", "]");
		Collection<String> close = dream.values();
		Set<String> open = dream.keySet();
		for(int i = 0; i < exp.length(); i++){
			currValue = exp.substring(i, i+1);
			if (open.contains(currValue)){
				symbols.push(currValue);
			}
			else if (close.contains(currValue)){
				if((!stackIsEmpty) || (currValue.compareTo(symbols.peek()) == 0)){
					symbols.pop();
				}
				else	
					return false;
			}
			if(stackIsEmpty){
				return true;
			}
		}
		return false;
	}

	//write a toString method
	public String toString(){
		if (checkExpression()){
			return exp + " is correct.";
		}
		else{
			return exp + " is incorrect.";
		}
	}
}