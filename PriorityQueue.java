public class PriorityQueue extends Queue
{
	public PriorityQueue(int size)
	{
		super(size);
	}

	public PriorityQueue()
	{
		super();
	}

	public void add(int a) throws Exception
	{
		if (top == -1)
		{
			top = 0;
		}

		if (bottom - top < queue.length - 1)
		{
			int indexOfInsertion = getBottomIndex() + 1;

			for (int i = top; i < bottom + 1; i++)
			{
				if (queue[i % queue.length] > a)
				{
					indexOfInsertion = i;
					break;
				}
			}

			for (int i = bottom + 1; i > indexOfInsertion; i--)
			{
				queue[i % queue.length] = queue[(i - 1) % queue.length];
			}
			queue[indexOfInsertion % queue.length] = a;
			bottom += 1;
		}
		else
		{
			throw new Exception("Queue is already full.");
		}
	}
}
