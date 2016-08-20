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

	public void printState()
	{
		System.out.println("Queue size : " + queue.length);
		System.out.println("Top index : " + ((top % queue.length) + 1));
		System.out.println("Bottom index : " + ((bottom % queue.length) + 1));
	}
}
