public class Queue
{
	private int queue[];
	private int top;
	private int bottom;

	public Queue(int size)
	{
		queue = new int[size];
		top = 0;
		bottom = 0;
	}

	public Queue()
	{
		queue = new int[20];
		top = 0;
		bottom = 0;
	}

	public void add(int a) throws Exception
	{
		if (bottom - top < queue.length)
		{
			queue[bottom % queue.length] = a;
			bottom += 1;
		}
		else
		{
			throw new Exception("Queue is full.");
		}

	}

	public int remove() throws Exception
	{
		if (top == bottom)
		{
			throw new Exception("Queue is empty.");
		}
		else
		{
			int i = top % queue.length;
			top++;
			return queue[i];
		}
	}

	private int getTopIndex()
	{
		int topIndex = top % queue.length;
		return topIndex;
	}

	private int getBottomIndex()
	{
		int bottomIndex = bottom % queue.length;
		return bottomIndex == 0 ? queue.length : bottomIndex;
	}

	public void printState()
	{
		System.out.println("Queue size : " + queue.length);
		System.out.println("Top index : " + getTopIndex());
		System.out.println("Bottom index : " + getBottomIndex());

		for (int i = top; i < bottom; i++)
		{
			System.out.print(queue[i % queue.length] + " ");
		}
		System.out.println();
	}
}
