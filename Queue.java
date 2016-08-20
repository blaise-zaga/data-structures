public class Queue
{
	protected int queue[];
	protected int top;
	protected int bottom;

	public Queue(int size)
	{
		queue = new int[size];
		top = -1;
		bottom = -1;
	}

	public Queue()
	{
		queue = new int[20];
		top = -1;
		bottom = -1;
	}

	public void add(int a) throws Exception
	{
		if (bottom - top < queue.length - 1)
		{
			queue[++bottom % queue.length] = a;

			if (top == -1)
			{
				top = 0;
			}
		}
		else
		{
			throw new Exception("Queue is already full.");
		}

	}

	public int remove() throws Exception
	{
		if (top > bottom)
		{
			throw new Exception("Queue is currently empty.");
		}
		else
		{
			int i = getTopIndex();
			top++;
			return queue[i];
		}
	}

	public int getTopIndex()
	{
		int topIndex = top % queue.length;
		return topIndex;
	}

	public int getBottomIndex()
	{
		int bottomIndex = bottom % queue.length;
		return bottomIndex;
	}

	public void printState()
	{
		System.out.println("Queue size : " + queue.length);
		System.out.println("Top index : " + getTopIndex());
		System.out.println("Bottom index : " + getBottomIndex());

		for (int i = top; i < bottom + 1; i++)
		{
			System.out.print(queue[i % queue.length] + " ");
		}
		System.out.println();
	}
}
