package linear;

public class FloatNode {

	float f;
	FloatNode fn;
	FloatNode(float f, FloatNode fn)
	{
		this.f=f;
		this.fn=fn;
	}
	public String toString()
	{
		return f+"";
	}
}
