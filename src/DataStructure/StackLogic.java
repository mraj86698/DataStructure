package DataStructure;

public class StackLogic
{
	private int maxSize;
	private long[] stackArray;
	private int top;

	/**
	 * This is an Stack logic
	 * @param s is to check an Size
	 * push to insert Element
	 * pop to delete the Element
	 * peek to print top most Element
	 * isEmpty()-to Check Empty or Not
	 * isFull()- to Check Full or Not
	 */
	public StackLogic(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}

	public void push(long j)
	{
	stackArray[++top] = j;
	}

	public long pop()
	{
	return stackArray[top--];
	}

	public long peek()
	{
	return stackArray[top];
	}

	public boolean isEmpty()
	{
	return (top == -1);
	}

	public boolean isFull()
	{
	return (top == maxSize - 1);
	}
}