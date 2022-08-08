package DataStructure;
/**
 * This is an Balenced Parenthesis
 * @author mraj
 * Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3.
 * where parentheses are used to order the performance of operations.
 */
public class BalencedParenthesis {

	public static void main(String[] args) {
		/**
		 * Read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3).
		 * Write a Stack Class to push open parenthesis "(" and pop closed parenthesis ")".
		 * At the End of the Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
		 * Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
		 * True or False to Show Arithmetic Expression is balanced or not.
		 */

		System.out.println("Enter max size: ");
		int n=Utility.inputInteger();


		/* Creating Stack */
		StackLogic stack = new StackLogic(n);

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = Utility.inputString();
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop());
					System.out.println("')' at index "+(i)+" matched with Balence Parenthesis '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i)+" is unmatched with Un Balenced Parenthesis");
					}
				}
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop())+" is unmatched");
		}

	}

}
