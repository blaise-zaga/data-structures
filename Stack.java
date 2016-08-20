public class Stack
{
	private int stack[];
	private int top;

	public Stack(int size)
	{
		stack = new int[size];
		top = -1;
	}

	public Stack()
	{
		stack = new int[20];
		top = -1;
	}

	public int peek() throws Exception
	{
		if (top < 0)
		{
			throw new Exception("The stack is currently empty.");
		}
		else
		{
			return stack[top];
		}
	}

	public void push(int a) throws Exception
	{
		if (top < stack.length - 1)
		{
			stack[++top] = a;
		}
		else
		{
			throw new Exception("The stack is already full.");
		}
	}

	public int pop() throws Exception
	{
		if (top >= 0)
		{
			return stack[top--];
		}
		else
		{
			throw new Exception("The stack is already empty.");
		}
	}

	public void printState()
	{
		System.out.println("Stack size : " + stack.length);
		System.out.println("Top index : " + top);

		for(int i = top; i >= 0; i--)
		{
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
