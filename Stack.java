public class Stack
{
	private int stack[];
	private int top;

	public Stack(int size)
	{
		stack = new int[size];
		top = 0;
	}

	public Stack()
	{
		stack = new int[20];
		top = 0;
	}

	public int peek()
	{
		return stack[top];
	}

	public void push(int a) throws Exception
	{
		if (top < stack.length)
		{
			stack[top++] = a;
		}
		else
		{
			throw new Exception("The stack is already full.");
		}
	}

	public int pop() throws Exception
	{
		if (top != 0)
		{
			return stack[--top];
		}
		else
		{
			throw new Exception("The stack is already empty.");
		}
	}
}
